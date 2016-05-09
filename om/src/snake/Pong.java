//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package snake;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	//private Ball ball;
	//private BlinkyBall ball;
	private SpeedUpBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys; 
	private int rightScore;
	private int leftScore;

	public Pong()
	{
		//set up all variables related to the game
		//ball = new Ball();
		//ball = new BlinkyBall();
		rightScore = 0;
		leftScore = 0;
		
		ball = new SpeedUpBall();
		
		ball.setPos(100, 100);
		ball.setHeight(10);
		ball.setWidth(10);
		ball.setXSpeed(1);
		ball.setYSpeed(2);
		ball.setColor(Color.RED);

		leftPaddle = new Paddle();
		leftPaddle.setPos(10, 10);
		leftPaddle.setHeight(100);
		leftPaddle.setWidth(10);
		leftPaddle.setSpeed(4);
		leftPaddle.setColor(Color.BLACK);

		rightPaddle = new Paddle();
		rightPaddle.setPos(780, 10);
		rightPaddle.setHeight(100);
		rightPaddle.setWidth(10);
		rightPaddle.setSpeed(4);
		rightPaddle.setColor(Color.BLACK);

		keys = new boolean[4];

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}

	public void update(Graphics window){
		paint(window);
		leftScorePaint(window);
		rightScorePaint(window);
	}

	public void paint(Graphics window)
	{

		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window); 

		/*		System.out.println("ball speed = "+ball.getXSpeed()+" : "+ball.getYSpeed());
		System.out.println("ball = "+ball.getX()+" :"+ball.getY()); 
		System.out.println("leftPaddle X = "+leftPaddle.getX()+" W = "+leftPaddle.getWidth());
		System.out.println("leftPaddle Y = "+leftPaddle.getY()+" H = "+leftPaddle.getHeight()); 
		System.out.println("rightPaddle X = "+rightPaddle.getX()+" W = "+rightPaddle.getWidth());
		System.out.println("rightPaddle Y = "+rightPaddle.getY()+" H = "+rightPaddle.getHeight()); 
		 */
		
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{ 
			ball.setXSpeed(-ball.getXSpeed());
		}

		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=580))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		/*if(	(ball.getXSpeed() < 0) &&
				(ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getXSpeed())))
		{
			if ((ball.getY()>=leftPaddle.getY()-ball.getYSpeed()) &&
				(ball.getY()<=leftPaddle.getY()+leftPaddle.getHeight()-ball.getYSpeed()))
			{
				ball.setXSpeed(-ball.getXSpeed());
			} else {
				//ball.setXSpeed(0);	
				//ball.setYSpeed(0);
				rightScore++;
			}
		}*/
		
		if(	(ball.getXSpeed() < 0) &&
				(ball.didCollideLeft(leftPaddle)))
		{
			if ((ball.getY()>=leftPaddle.getY()-ball.getYSpeed()) &&
				(ball.getY()<=leftPaddle.getY()+leftPaddle.getHeight()-ball.getYSpeed()))
			{
				ball.setXSpeed(-ball.getXSpeed());
			} else {
				//ball.setXSpeed(0);	
				//ball.setYSpeed(0);
				rightScore++;				
			}
		}


		//see if the ball hits the right paddle
		/*if(	(ball.getXSpeed() > 0) &&
				(ball.getX()>=rightPaddle.getX()-rightPaddle.getWidth()-Math.abs(ball.getXSpeed())))
		{
			if ((ball.getY()>=rightPaddle.getY()-ball.getYSpeed()) &&
					(ball.getY()<=rightPaddle.getY()+rightPaddle.getHeight()-ball.getYSpeed()))
				{
					ball.setXSpeed(-ball.getXSpeed());
				} 
			else {
				//ball.setXSpeed(0);	
				//ball.setYSpeed(0);
				leftScore++;
			}
		}*/
		
		if((ball.getXSpeed() > 0) &&
				(ball.didCollideLeft(leftPaddle)))
		{
			if ((ball.getY()>=rightPaddle.getY()-ball.getYSpeed()) &&
				(ball.getY()<=rightPaddle.getY()+rightPaddle.getHeight()-ball.getYSpeed()))
			{
				ball.setXSpeed(-ball.getXSpeed());
			} else {
				//ball.setXSpeed(0);	
				//ball.setYSpeed(0);
				leftScore++;				
			}
		}

		//move left paddle up/down and draw it on the window
		if(keys[0] == true){
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true){
			leftPaddle.moveDownAndDraw(window);
		}
		//move right paddle up/down and draw it on the window
		if(keys[2] == true){
			rightPaddle.moveUpAndDraw(window);
		}
		if(keys[3] == true){
			rightPaddle.moveDownAndDraw(window);
		}
	}
	
	/*public int leftScore(){
		int score = 0;
		if(ball.getXSpeed()==0 && ball.getYSpeed()==0
				&&!ball.didCollideRight(rightPaddle)
				&& ball.getX()==780){
			score++;
		}
		return score;
	}
	public int rightScore(){
		int score = 0;
		if(ball.getXSpeed()==0 && ball.getYSpeed()==0
				&&!ball.didCollideLeft(leftPaddle)
				&& ball.getX()==10){
			score++;
		}
		return score;
	}*/
	
	public void leftScorePaint(Graphics window){

		String str = new String();
		str = "Left Paddle Score == "+leftScore;
		window.drawString(str, 350, 550);
		
	}
	public void rightScorePaint(Graphics window){

		String str = new String();
		str = "Right Paddle Score == "+rightScore;
		window.drawString(str, 350, 500);
	}

	public void keyPressed(KeyEvent e){
		switch(toUpperCase(e.getKeyChar())){
		case 'W' : keys[0]=true; break;
		case 'Z' : keys[1]=true; break;
		case 'I' : keys[2]=true; break;
		case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar())){
		case 'W' : keys[0]=false; break;
		case 'Z' : keys[1]=false; break;
		case 'I' : keys[2]=false; break;
		case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}

	public void run()
	{
		try
		{
			while(true)
			{
				Thread.currentThread().sleep(8);
				repaint();
			}
		}catch(Exception e)
		{
		}
	}	
}