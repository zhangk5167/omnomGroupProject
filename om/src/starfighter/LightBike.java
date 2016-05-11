package starfighter;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public abstract class LightBike implements Locatable
{
	private int xPos;
	private int yPos;

	public LightBike()
	{
		xPos = 0;
		yPos = 0;
	}

	public LightBike(int x, int y)
	{
		setPos(x,y);
	}

	public void setPos( int x, int y)
	{
		xPos = x;
		yPos = y;
	}


	public void setX(int x)
	{
		xPos = x;
	}


	public void setY(int y)
	{
		yPos = y;
	}

	public int getX()
	{
		return xPos;
	}


	public int getY()
	{
		return yPos;
	}

	public abstract void setSpeed( int s );
	public abstract int getSpeed();
	public abstract void draw(Graphics window);

	

	public String toString()
	{
		return "The bike's position is ("+xPos+","+yPos+")";
	}
}