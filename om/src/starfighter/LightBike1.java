package starfighter;//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class LightBike1 extends LightBike
{
	private int speed;
	private Image image;
	private int w = 80;
	private int h = 25;
	private String dir;
	
	public LightBike1()
	{
		this(0,0,0);
	}

	public LightBike1(int x, int y)
	{
		this(x,y,0);
	}

	public LightBike1(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("src/starfighter/lightbike1left.gif"));
			dir = "LEFT";
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
				image = ImageIO.read(new File("src/starfighter/lightbike1left.gif"));
			if(direction.equals("RIGHT"))
				image = ImageIO.read(new File("src/starfighter/lightbike1right.gif"));      
			if(direction.equals("UP"))
				image = ImageIO.read(new File("src/starfighter/lightbike1up.gif"));     
			if(direction.equals("DOWN"))
				image = ImageIO.read(new File("src/starfighter/lightbike1down.gif"));
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
			  //
			  if ("UP".equals(dir)) {
				  int x1 = getX();
				  int y1 = getY();
				  setX(getX() - 80 + 25/2);
				  setY(getY() + 80 - 25/2);
				  
				  int x2 = getX();
				  int y2 = getY();
				  System.out.println("after x=" + getX() + " y=" + getY());
			  } else if("DOWN".equals(dir)) {
				  setX(getX() - 80 + 25/2);
				  setY(getY() - 25/2);
			  } else if("RIGHT".equals(dir)) {
				  setX(getX() - 80);
			  }
			  //
			  
		      w = 80;
		      h = 25;
		      dir = "LEFT";
			}
			if(direction.equals("RIGHT")){
				  //
				  if ("UP".equals(dir)) {
					  setX(getX() + 25/2);
					  setY(getY() + 80 - 25/2);
				  } else if("DOWN".equals(dir)) {
					  setX(getX() + 25/2);
					  setY(getY() - 25/2);
				  } else if("LEFT".equals(dir)) {
					  setX(getX() + 80);
				  }
				  //
			      w = 80;
			      h = 25;
			      dir = "RIGHT";
			}
			if(direction.equals("UP")){
				  //
				  if ("DOWN".equals(dir)) {
					  setY(getY() - 80);
				  } else if("RIGHT".equals(dir)) {
					  setX(getX() - 25/2);
					  setY(getY() - 80 + 25/2);
				  } else if("LEFT".equals(dir)) {
					  setX(getX() + 80 - 25/2);
					  setY(getY() - 80 + 25/2);
				  }
				  //
			      w = 25;
			      h = 80;
			      dir = "UP";
			}
			if(direction.equals("DOWN")){
				  //
				  if ("UP".equals(dir)) {
					  setY(getY() + 80);
				  } else if("RIGHT".equals(dir)) {
					  setX(getX() - 25/2);
					  setY(getY() + 25/2);
				  } else if("LEFT".equals(dir)) {
					  setX(getX() + 80 - 25/2);
					  setY(getY() + 25/2);
				  }
				  //
			      w = 25;
			      h = 80;
			      dir = "DOWN";
			}
			setImage(direction);
	}

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
=======
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
	

	public void draw( Graphics window )
	{
		int x;
<<<<<<< HEAD
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
		if(dir.equals("UP")||dir.equals("DOWN")){
			x = getX()+25;
		}
		else{
			x=getX();
		}
		
   	window.drawImage(image,x,getY(),w,h,null);
>>>>>>> 8c461e9d71e8db2d8f7c06260a06cbbc2f6431fe
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
