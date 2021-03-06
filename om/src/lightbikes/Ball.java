//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package lightbikes;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200,0,0);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y){
		super(x,y,0,0);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h){
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color col){
		super(x,y,w,h, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xSpeed, int ySpeed){
		super(x,y,w,h, col);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	public int getXSpeed(){
		return xSpeed;
	}
	public void setXSpeed(int speed){
		xSpeed = speed;
	}
	public int getYSpeed(){
		return ySpeed;
	}
	public void setYSpeed(int speed){
		ySpeed = speed;
	}
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   super.draw(window, Color.WHITE);
	   setColor(Color.BLUE);
	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
	   super.draw(window, Color.RED);

	   //setY
	   // Color rand = new Color(1,3,4);
	   // setColor(rand);
	   //draw the ball at its new location
	   //super.draw(window, rand);
      
   }
   
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		if(super.equals(other)
				&& xSpeed == other.xSpeed 
				&& ySpeed == other.ySpeed){
			return true;
		}

		else return false;
	}
	
	
	//Collidable implemented
	
		public boolean didCollideLeft(Object obj){
			Block other = (Block) obj;
			if(getX()<=other.getX()){
				return true;
			}
			else{return false;}
		}
		public boolean didCollideRight(Object obj){
			Block other = (Block) obj;
			if(getX()<=other.getX()){
				return true;
			}
			else{return false;}
		}
	    public boolean didCollideTop(Object obj){
			Block other = (Block) obj;
			if(getY()<=other.getY()){
				return true;
			}
			else{return false;}
	    }
		public boolean didCollideBottom(Object obj){
			Block other = (Block) obj;
			if(getY()>=other.getY()){
				return true;
			}
			else{return false;}
		}
		
		
	@Override
	public String toString() {
		return  super.toString()+ " "
				+ xSpeed + " " 
				+ ySpeed;
	}   

   //add the get methods

   //add a toString() method
}