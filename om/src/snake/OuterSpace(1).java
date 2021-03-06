package Unit17;//� A+ Computer Science  -  www.apluscompsci.com
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
	private Ship ship;
	private Alien alienOne;
	private int OneX;
	private int OneLife;
	private Alien alienTwo;
	private int TwoX;
	private int TwoLife;
	private Alien alienThree;
	private int ThreeX;
	private int ThreeLife;
	private Alien alienFour;
	private int FourX;
	private int FourLife;
	private Alien alienFive;
	private int FiveX;
	private int FiveLife;
	private Alien alienSix;
	private int SixX;
	private int SixLife;
	private Alien alienSeven;
	private int SevenX;
	private int SevenLife;
	private Alien alienEight;
	private int EightX;
	private int EightLife;
	private Alien alienNine;
	private int NineX;
	private int NineLife;
	private Alien alienTen;
	private int TenX;
	private int TenLife;
	
	private Ammo shot;

	
	private ArrayList<Alien> aliens;
	/*
	private ArrayList<Ammo> shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new Ship(370,450,3);
		alienOne = new Alien(20,50,1);
		OneX = 100;
		OneLife = 1;
		alienTwo = new Alien(170,50,1);
		TwoX = 100;
		TwoLife = 1;
		alienThree = new Alien(320,50,1);
		ThreeX = 100;
		ThreeLife = 1;
		alienFour = new Alien(470,50,1);
		FourX = 100;
		FourLife = 1;
		alienFive = new Alien(620,50,1);
		FiveX = 100;
		FiveLife = 1;
		alienSix = new Alien(20,150,1);
		SixX = 100;
		SixLife = 1;
		alienSeven = new Alien(170,150,1);
		SevenX = 100;
		SevenLife = 1;
		alienEight = new Alien(320,150,1);
		EightX = 100;
		EightLife = 1;
		alienNine = new Alien(470,150,1);
		NineX = 100;
		NineLife = 1;
		alienTen = new Alien(620,150,1);
		TenX = 100;
		TenLife = 1;
		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
	   ship.draw(window);
	   if(OneLife == 1){
	   alienOne.draw(window);
	   }
	   if(TwoLife == 1){
	   alienTwo.draw(window);
	   }
	   if(ThreeLife == 1){
	   alienThree.draw(window);
	   }
	   if(FourLife == 1){
	   alienFour.draw(window);
	   }
	   if(FiveLife == 1){
	   alienFive.draw(window);
	   }
	   if(SixLife == 1){
	   alienSix.draw(window);
	   }
	   if(SevenLife == 1){
	   alienSeven.draw(window);
	   }
	   if(EightLife == 1){
	   alienEight.draw(window);
	   }
	   if(NineLife == 1){
	   alienNine.draw(window);
	   }
	   if(TenLife == 1){
	   alienTen.draw(window);
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
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 15, 30 );
		
		if(OneX>0){
			alienOne.move("RIGHT");
			OneX--;
			if(OneX==0){
				OneX-=100;
				alienOne.move("DOWN");
				alienOne.move("DOWN");
			}
		}
		else if(OneX<0){
			alienOne.move("LEFT");
			OneX++;
			if(OneX==0){
				OneX+=100;
				alienOne.move("DOWN");
				alienOne.move("DOWN");
			}
		}
		if(TwoX>0){
			alienTwo.move("RIGHT");
			TwoX--;
			if(TwoX==0){
				TwoX-=100;
				alienTwo.move("DOWN");
				alienTwo.move("DOWN");
			}
		}
		else if(TwoX<0){
			alienTwo.move("LEFT");
			TwoX++;
			if(TwoX==0){
				TwoX+=100;
				alienTwo.move("DOWN");
				alienTwo.move("DOWN");
			}
		}
		if(ThreeX>0){
			alienThree.move("RIGHT");
			ThreeX--;
			if(ThreeX==0){
				ThreeX-=100;
				alienThree.move("DOWN");
				alienThree.move("DOWN");
			}
		}
		else if(ThreeX<0){
			alienThree.move("LEFT");
			ThreeX++;
			if(ThreeX==0){
				ThreeX+=100;
				alienThree.move("DOWN");
				alienThree.move("DOWN");
			}
		}
		if(FourX>0){
			alienFour.move("RIGHT");
			FourX--;
			if(FourX==0){
				FourX-=100;
				alienFour.move("DOWN");
				alienFour.move("DOWN");
			}
		}
		else if(FourX<0){
			alienFour.move("LEFT");
			FourX++;
			if(FourX==0){
				FourX+=100;
				alienFour.move("DOWN");
				alienFour.move("DOWN");
			}
		}
		if(FiveX>0){
			alienFive.move("RIGHT");
			FiveX--;
			if(FiveX==0){
				FiveX-=100;
				alienFive.move("DOWN");
				alienFive.move("DOWN");
			}
		}
		else if(FiveX<0){
			alienFive.move("LEFT");
			FiveX++;
			if(FiveX==0){
				FiveX+=100;
				alienFive.move("DOWN");
				alienFive.move("DOWN");
			}
		}
		if(SixX>0){
			alienSix.move("RIGHT");
			SixX--;
			if(SixX==0){
				SixX-=100;
				alienSix.move("DOWN");
				alienSix.move("DOWN");
			}
		}
		else if(SixX<0){
			alienSix.move("LEFT");
			SixX++;
			if(SixX==0){
				SixX+=100;
				alienSix.move("DOWN");
				alienSix.move("DOWN");
			}
		}
		if(SevenX>0){
			alienSeven.move("RIGHT");
			SevenX--;
			if(SevenX==0){
				SevenX-=100;
				alienSeven.move("DOWN");
				alienSeven.move("DOWN");
			}
		}
		else if(SevenX<0){
			alienSeven.move("LEFT");
			SevenX++;
			if(SevenX==0){
				SevenX+=100;
				alienSeven.move("DOWN");
				alienSeven.move("DOWN");
			}
		}
		if(EightX>0){
			alienEight.move("RIGHT");
			EightX--;
			if(EightX==0){
				EightX-=100;
				alienEight.move("DOWN");
				alienEight.move("DOWN");
			}
		}
		else if(EightX<0){
			alienEight.move("LEFT");
			EightX++;
			if(EightX==0){
				EightX+=100;
				alienEight.move("DOWN");
				alienEight.move("DOWN");
			}
		}
		if(NineX>0){
			alienNine.move("RIGHT");
			NineX--;
			if(NineX==0){
				NineX-=100;
				alienNine.move("DOWN");
				alienNine.move("DOWN");
			}
		}
		else if(NineX<0){
			alienNine.move("LEFT");
			NineX++;
			if(NineX==0){
				NineX+=100;
				alienNine.move("DOWN");
				alienNine.move("DOWN");
			}
		}
		if(TenX>0){
			alienTen.move("RIGHT");
			TenX--;
			if(TenX==0){
				TenX-=100;
				alienTen.move("DOWN");
				alienTen.move("DOWN");
			}
		}
		else if(TenX<0){
			alienTen.move("LEFT");
			TenX++;
			if(TenX==0){
				TenX+=100;
				alienTen.move("DOWN");
				alienTen.move("DOWN");
			}
		}
		
		
		
		
		
		
		if(keys[0] == true)
		{
			if(ship.getX()<-15+ship.getSpeed()){
				ship.setX(770);
			}
			else{
			ship.move("LEFT");
			}
		}
		else if(keys[1] == true)
		{
			if(ship.getX()>720-ship.getSpeed()){
				ship.setX(-80);
			}
			else{
			ship.move("RIGHT");
			}
		}
		else if(keys[2] == true)
		{
			if(ship.getY()<30+ship.getSpeed()){
				
			}
			else{
			ship.move("UP");
			}
		}
		else if(keys[3] == true)
		{
			if(ship.getY()>480-ship.getSpeed()){
				
			}
			else{
			ship.move("DOWN");
			}
		}
		if(keys[4] == true)
		{
			shot = new Ammo(ship.getX()+30,ship.getY(),1);
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
					shot.move("UP");
					shot.draw(window);
					if(shot.getX()>alienOne.getX()-40&&shot.getX()<alienOne.getX()+40&&shot.getY()<alienOne.getY()+40&&shot.getY()>alienOne.getY()-40){
						OneLife--;
						alienOne.setY(700);
						break;
					}
					if(shot.getX()>alienTwo.getX()-40&&shot.getX()<alienTwo.getX()+40&&shot.getY()<alienTwo.getY()+40&&shot.getY()>alienTwo.getY()-40){
						TwoLife--;
						alienTwo.setY(700);
						break;
					}
					if(shot.getX()>alienThree.getX()-40&&shot.getX()<alienThree.getX()+40&&shot.getY()<alienThree.getY()+40&&shot.getY()>alienThree.getY()-40){
						ThreeLife--;
						alienThree.setY(700);
						break;
					}
					if(shot.getX()>alienFour.getX()-40&&shot.getX()<alienFour.getX()+40&&shot.getY()<alienFour.getY()+40&&shot.getY()>alienFour.getY()-40){
						FourLife--;
						alienFour.setY(700);
						break;
					}
					if(shot.getX()>alienFive.getX()-40&&shot.getX()<alienFive.getX()+40&&shot.getY()<alienFive.getY()+40&&shot.getY()>alienFive.getY()-40){
						FiveLife--;
						alienFive.setY(700);
						break;
					}
					if(shot.getX()>alienSix.getX()-40&&shot.getX()<alienSix.getX()+40&&shot.getY()<alienSix.getY()+40&&shot.getY()>alienSix.getY()-40){
						SixLife--;
						alienSix.setY(700);
						break;
					}
					if(shot.getX()>alienSeven.getX()-40&&shot.getX()<alienSeven.getX()+40&&shot.getY()<alienSeven.getY()+40&&shot.getY()>alienSeven.getY()-40){
						SevenLife--;
						alienSeven.setY(700);
						break;
					}
					if(shot.getX()>alienEight.getX()-40&&shot.getX()<alienEight.getX()+40&&shot.getY()<alienEight.getY()+40&&shot.getY()>alienEight.getY()-40){
						EightLife--;
						alienEight.setY(700);
						break;
					}
					if(shot.getX()>alienNine.getX()-40&&shot.getX()<alienNine.getX()+40&&shot.getY()<alienNine.getY()+40&&shot.getY()>alienNine.getY()-40){
						NineLife--;
						alienNine.setY(700);
						break;
					}
					if(shot.getX()>alienTen.getX()-40&&shot.getX()<alienTen.getX()+40&&shot.getY()<alienTen.getY()+40&&shot.getY()>alienTen.getY()-40){
						TenLife--;
						alienTen.setY(700);
						break;
					}
					//if(shot)
					/*if(keys[0] == true)
					{
						if(ship.getX()<-15+ship.getSpeed()){
							ship.setX(770);
						}
						else{
						window.setColor(Color.BLACK);
						window.drawRect(ship.getX(), ship.getY(), 80, 80);
						ship.setX(ship.getX()-(ship.getSpeed()/3));
						ship.draw(window);
						repaint();
						}
					}
					else if(keys[1] == true)
					{
						if(ship.getX()>720-ship.getSpeed()){
							ship.setX(-80);
						}
						else{
							window.setColor(Color.BLACK);
							window.drawRect(ship.getX(), ship.getY(), 80, 80);
						ship.setX(ship.getX()+(ship.getSpeed()/3));
						ship.draw(window);
						repaint();
						}
					}
					
					else if(keys[2] == true)
					{
						if(ship.getY()<30+ship.getSpeed()){
							
						}
						else{
							window.setColor(Color.BLACK);
							window.drawRect(ship.getX(), ship.getY(), 80, 80);
						ship.setY(ship.getY()-(ship.getSpeed()/3));
						ship.draw(window);
						repaint();
						}
						
					}
					else if(keys[3] == true)
					{
						if(ship.getY()>480-ship.getSpeed()){
							
						}
						else{
							window.setColor(Color.BLACK);
							window.drawRect(ship.getX(), ship.getY(), 80, 80);
						ship.setY(ship.getY()+(ship.getSpeed()/3));
						ship.draw(window);
						repaint();
						}

					}*/
					
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

