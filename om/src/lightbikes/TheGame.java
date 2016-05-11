//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package lightbikes;
import javax.swing.JFrame;

import java.awt.Component;
import java.awt.Graphics;

public class TheGame extends JFrame
{
	private static final int WIDTH = 820;
	private static final int HEIGHT = 600;

	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
 
 		Pong game = new Pong();
		
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
						
		setVisible(true);
		
	}
	
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
}