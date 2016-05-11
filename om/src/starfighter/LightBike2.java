package starfighter;//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
<<<<<<< HEAD

=======
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
import javax.imageio.ImageIO;

public class LightBike2 extends LightBike
{
	private int speed;
	private Image image;
<<<<<<< HEAD
	private int w = 80;
	private int h = 25;
	private String dir;
	
=======

>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
	public LightBike2()
	{
		this(0,0,0);
	}

	public LightBike2(int x, int y)
	{
		this(x,y,0);
	}

	public LightBike2(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
<<<<<<< HEAD
			image = ImageIO.read(new File("src/starfighter/lightbike2right.gif"));
			dir = "RIGHT";
		}
		catch(Exception e)
		{
			System.out.println("NO BIKE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
	
	public void setImage(String direction)
	{
		try
		{
			if(direction.equals("LEFT"))
				image = ImageIO.read(new File("src/starfighter/lightbike2left.gif"));
			if(direction.equals("RIGHT"))
				image = ImageIO.read(new File("src/starfighter/lightbike2right.gif"));      
			if(direction.equals("UP"))
				image = ImageIO.read(new File("src/starfighter/lightbike2up.gif"));     
			if(direction.equals("DOWN"))
				image = ImageIO.read(new File("src/starfighter/lightbike2down.gif"));
		}
		catch(Exception e)
		{
			System.out.println("NO BIKE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

	public String getDirection(){
		return dir;
	}
	
	public void move()
	{
		if(dir.equals("LEFT")){
	      setX(getX()-getSpeed());

		}
		if(dir.equals("RIGHT")){
		      setX(getX()+getSpeed());

		}
		if(dir.equals("UP")){
		      setY(getY()-getSpeed());
		      

		}
		if(dir.equals("DOWN")){
		      setY(getY()+getSpeed());
		      

		}


	}
	
	public void turn(String direction){
		if(direction.equals("LEFT")){

		      w = 80;
		      h = 25;
		      dir = "LEFT";
			}
			if(direction.equals("RIGHT")){
			
			      w = 80;
			      h = 25;
			      dir = "RIGHT";
			}
			if(direction.equals("UP")){
			     
			      w = 25;
			      h = 80;
			      dir = "UP";
			}
			if(direction.equals("DOWN")){

			      w = 25;
			      h = 80;
			      dir = "DOWN";
			}
			setImage(direction);
	}
=======
			image = ImageIO.read(new File("src/Unit17/ship.gif"));
		}
		catch(Exception e)
		{
			System.out.println("NO SHIP!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	

<<<<<<< HEAD
	public int getPicX(){
		int x;
		if(dir.equals("UP")){
			x = getX()+68;
		}
		else if(dir.equals("DOWN")){
			x = getX()+69;
		}
		else if(dir.equals("RIGHT")){
			x = getX()+82;
		}
		else{
			x = getX();
		}
		return x;
	}
	
	public int getPicY(){
		int y;
		if(dir.equals("UP")){
			y = getY()-68;
		}
		else if(dir.equals("DOWN")){
			y = getY()+14;
		}
		else if(dir.equals("RIGHT")){
			y = getY()+1;
		}
		else{
			y = getY();
		}
		y+=12;
		return y;
	}
	
	public void draw( Graphics window )
	{
		int x;
		int y;
		if(dir.equals("UP")){
			x = getX()+68;
			y = getY()-68;
		}
		else if(dir.equals("DOWN")){
			x = getX()+69;
			y = getY()+14;
		}
		else if(dir.equals("RIGHT")){
			x = getX()+82;
			y = getY()+1;
		}
		else{
			x = getX();
			y = getY();
		}
		
   	window.drawImage(image,x,y,w,h,null);
=======
	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),80,80,null);
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
