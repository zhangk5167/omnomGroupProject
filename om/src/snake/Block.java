package snake;

import java.awt.color.*;

public class Block {
private int xPos;
private int yPos;
private int width = 5;
//private Color = 

	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public Block(int x, int y, int wid)
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
	public String toString()
	{
		return" ";
	}
}
