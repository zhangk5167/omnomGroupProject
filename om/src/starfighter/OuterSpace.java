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
<<<<<<< HEAD
	private LightBike2 ship2;
	

=======
	
	private Nothing shot;
	private ArrayList<Trail1> list1 = new ArrayList<Trail1>();
	

	/*
	private ArrayList<Ammo> shots;
	*/
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

<<<<<<< HEAD
		keys = new boolean[8];

		ship = new LightBike1(1500,100,2);
		ship2 = new LightBike2(220,820,2);

=======
		keys = new boolean[5];

		ship = new LightBike1(370,450,2);
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe

		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
<<<<<<< HEAD
	   
=======
	   ship.draw(window);
<<<<<<< HEAD
	   ship2.draw(window);
=======
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
>>>>>>> origin/master
	   
	   //for(int a = 0; a<list1.size(); a++){
		//   list1.get(a).draw(window);
	   //}
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		//path1.setX(ship.getX() - 30);
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		
		//Color blueish = new Color(53,205,236);
		//window.setColor(blueish);
		//window.drawRect(ship.getX(), ship.getY(), 2, 2);
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,1900,1000);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 15, 30 );
		
<<<<<<< HEAD
		window.setColor(Color.BLACK);
		window.fillRect(ship.getX(),ship.getY(),80,80);
		
		//Trail1 path1 = new Trail1(ship.getX()+80,ship.getY()+80);
		//path1.draw(twoDGraph);
		ship.draw(twoDGraph);
=======
<<<<<<< HEAD

		//if(ship.getDirection().equals("LEFT")){
		Trail1 path1 = new Trail1(ship.getX()+80,ship.getY()+12);
		path1.draw(window);
		Trail2 path2 = new Trail2(ship2.getX()+80,ship2.getY()+12);
		path2.draw(window);
		//}
		//if(ship.getDirection().equals("UP")){
		//Trail1 path1 = new Trail1(ship.getX()+92,ship.getY()+60);
		//path1.draw(window);
		//}
		//list1.add(path1);
		
		if(ship2.getDirection().equals("LEFT")){
			if(ship2.getX()<-80+ship2.getSpeed()){
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX(),ship2.getY(),80,25);
				ship2.setX(1860);
			}
			else{
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX(),ship2.getY(),80,25);
				ship2.move();
			}
		}
		if(ship2.getDirection().equals("RIGHT")){
			if(ship2.getX()>1860-ship2.getSpeed()){
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX()+82,ship2.getY()+1,80,25);
				ship2.setX(-80);
			}
			else{
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX()+82,ship2.getY()+1,80,25);
			ship2.move();
			}
		}
		if(ship2.getDirection().equals("UP")){
			if(ship2.getY()<-12+ship2.getSpeed()){
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX()+68,ship2.getY()-68,25,80);
				ship2.setY(952);
			}
			else{
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX()+68,ship2.getY()-68,25,80);
			ship2.move();
			}
		}
		if(ship2.getDirection().equals("DOWN")){
			if(ship2.getY()>952-ship2.getSpeed()){
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX()+69,ship2.getY()+15,25,80);
				ship2.setY(-12);
			}
			else{
				window.setColor(Color.BLACK);
				window.fillRect(ship2.getX()+69,ship2.getY()+15,25,80);
				ship2.move();
			}
		}
		
		
		
		
=======
>>>>>>> origin/master
		
		//list1.add(path1);
		
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
		
		
		if(ship.getDirection().equals("LEFT")){
			
			if(ship.getX()<-80+ship.getSpeed()){
				
			}
			else{
//				window.setColor(Color.BLACK);
//				window.fillRect(ship.getX(),ship.getY(),80,25);
				ship.move();
			}
		}
		if(ship.getDirection().equals("RIGHT")){
			if(ship.getX()>1860-ship.getSpeed()){
				window.setColor(Color.BLACK);
<<<<<<< HEAD
				window.fillRect(ship.getX()+82,ship.getY()+1,80,25);
				ship.setX(-80);
			}
			else{
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+82,ship.getY()+1,80,25);
=======
				window.fillRect(ship.getX(),ship.getY(),80,25);
				ship.setX(0);
			}
			else{
<<<<<<< HEAD
//				window.setColor(Color.BLACK);
//				window.fillRect(ship.getX(),ship.getY(),80,25);
=======
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX(),ship.getY(),80,25);
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
>>>>>>> origin/master
			ship.move();
			}
		}
		if(ship.getDirection().equals("UP")){
<<<<<<< HEAD
			if(ship.getY()<-12+ship.getSpeed()){
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+68,ship.getY()-68,25,80);
				ship.setY(952);
			}
			else{
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+68,ship.getY()-68,25,80);
=======
			if(ship.getY()<0+ship.getSpeed()){
//				window.setColor(Color.BLACK);
//				window.fillRect(ship.getX()+25,ship.getY(),25,80);
				ship.setY(940);
			}
			else{
<<<<<<< HEAD
//				window.setColor(Color.BLACK);
//				window.fillRect(ship.getX()+25,ship.getY(),25,80);
=======
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+25,ship.getY(),25,80);
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
>>>>>>> origin/master
			ship.move();
			}
		}
		if(ship.getDirection().equals("DOWN")){
<<<<<<< HEAD
			if(ship.getY()>952-ship.getSpeed()){
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+69,ship.getY()+15,25,80);
				ship.setY(-12);
			}
			else{
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+69,ship.getY()+15,25,80);
=======
			if(ship.getY()>940-ship.getSpeed()){
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+25,ship.getY(),25,80);
				ship.setY(0);
			}
			else{
<<<<<<< HEAD
//				window.setColor(Color.BLACK);
//				window.fillRect(ship.getX()+25,ship.getY(),25,80);
=======
				window.setColor(Color.BLACK);
				window.fillRect(ship.getX()+25,ship.getY(),25,80);
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
>>>>>>> origin/master
				ship.move();
			}
		}
		
		
		if(keys[0] == true)
		{
<<<<<<< HEAD
			window.setColor(Color.BLACK);
			window.fillRect(ship.getX(),ship.getY()-50,80,150);
=======
<<<<<<< HEAD
			if(!ship.getDirection().equals("RIGHT"))
=======
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
>>>>>>> origin/master
			ship.turn("LEFT");
		}
		else if(keys[1] == true)
		{
<<<<<<< HEAD
			ship.turn("RIGHT");	
=======
<<<<<<< HEAD
			if(!ship.getDirection().equals("LEFT"))
=======
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
			ship.turn("RIGHT");
>>>>>>> origin/master
		}
		else if(keys[2] == true)
		{
<<<<<<< HEAD
			if(!ship.getDirection().equals("DOWN"))
=======
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
			ship.turn("UP");
		}
		else if(keys[3] == true)
		{
<<<<<<< HEAD
=======
<<<<<<< HEAD
			if(!ship.getDirection().equals("UP"))
			ship.turn("DOWN");
		}
		
		
		if(keys[4] == true)
		{
			if(!ship2.getDirection().equals("RIGHT"))
			ship2.turn("LEFT");
		}
		else if(keys[5] == true)
		{
			if(!ship2.getDirection().equals("LEFT"))
			ship2.turn("RIGHT");
		}
		else if(keys[6] == true)
		{
			if(!ship2.getDirection().equals("DOWN"))
			ship2.turn("UP");
		}
		else if(keys[7] == true)
		{
			if(!ship2.getDirection().equals("UP"))
			ship2.turn("DOWN");
		}
		
		
=======

>>>>>>> origin/master
			ship.turn("DOWN");
		}
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
		/*if(keys[4] == true)
		{
			shot = new Nothing(ship.getX()+30,ship.getY(),1);
			shot.draw(window);
			/*while(shot.getY()>0){
				shot.setY(shot.getY()-shot.getSpeed());
				shot.draw(window);
			}*/
			/*try{
				while(shot.getY()>0)
				{
					window.setColor(Color.BLACK);
					Thread.currentThread().sleep(1);
					//shot.setY(shot.getY()-shot.getSpeed());
					window.drawRect(shot.getX(), shot.getY(), 20, 20);
					
				}
			}catch(Exception e){
			}
			
		}*/
		
		//add code to move stuff

		
		//twoDGraph.drawImage(back, null, 0, 0);
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
<<<<<<< HEAD
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[4] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[5] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[6] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[7] = true;
		}
=======
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
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
<<<<<<< HEAD
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[4] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[5] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[6] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[7] = false;
		}
=======
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
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

