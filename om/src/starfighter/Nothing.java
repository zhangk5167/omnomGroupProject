package starfighter;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Nothing extends LightBike
{
	//private int speed;
	private Image image;
	
	public Nothing()
	{
		super(0,0);
		speed = 0;
	}

	public Nothing(int x, int y)
	{
		super(x,y);
		speed = 0;
	}

	public Nothing(int x, int y, int s)
	{
		super(x,y);
		speed = s;
		try
		{
			image = ImageIO.read(new File("src/Unit17/rocket.gif"));
		}
		catch(Exception e)
		{
			System.out.println("NO SHIP!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),20,20,null);
	}
	
	
	public String toString()
	{
		return "The rocket is at ("+getX()+","+getY()+")";
	}
}