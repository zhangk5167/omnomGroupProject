package starfighter;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

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
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private LightBike1 ship;
	
	private Nothing shot;
	private ArrayList<Trail1> list1 = new ArrayList<Trail1>();
	

	/*
	private ArrayList<Ammo> shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new LightBike1(370,450,2);

		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
	   ship.draw(window);
	   for(int a = 0; a<list1.size(); a++){
		   list1.get(a).draw(window);
	   }
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,1900,1000);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 15, 30 );
		
		Trail1 path1 = new Trail1(ship.getX()+40,ship.getY()+12);
		path1.draw(window);
		list1.add(path1);
		if(ship.getDirection().equals("LEFT")){
			if(ship.getX()<0+ship.getSpeed()){
				ship.setX(1860);
			}
			else{
				ship.move();
			}
		}
		if(ship.getDirection().equals("RIGHT")){
			if(ship.getX()>1860-ship.getSpeed()){
				ship.setX(0);
			}
			else{
			ship.move();
			}
		}
		if(ship.getDirection().equals("UP")){
			if(ship.getY()<0+ship.getSpeed()){
				ship.setY(940);
			}
			else{
			ship.move();
			}
		}
		if(ship.getDirection().equals("DOWN")){
			if(ship.getY()>940-ship.getSpeed()){
				ship.setY(0);
			}
			else{
			ship.move();
			}
		}
		
		
		if(keys[0] == true)
		{
			ship.turn("LEFT");
		}
		else if(keys[1] == true)
		{
			ship.turn("RIGHT");
		}
		else if(keys[2] == true)
		{
			ship.turn("UP");
		}
		else if(keys[3] == true)
		{

			ship.turn("DOWN");
		}
		if(keys[4] == true)
		{
			shot = new Nothing(ship.getX()+30,ship.getY(),1);
			shot.draw(window);
			/*while(shot.getY()>0){
				shot.setY(shot.getY()-shot.getSpeed());
				shot.draw(window);
			}*/
			try{
				while(shot.getY()>0)
				{
					window.setColor(Color.BLACK);
					Thread.currentThread().sleep(1);
					//shot.setY(shot.getY()-shot.getSpeed());
					window.drawRect(shot.getX(), shot.getY(), 20, 20);
					
				}
			}catch(Exception e){
			}
			
		}

		//add code to move stuff


		//add in collision detection


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}
