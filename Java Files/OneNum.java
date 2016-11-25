import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OneNum extends JApplet implements KeyListener
{
	char number = ' ';

	public void init()
	{
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent e)
	{	
	}

	public void keyReleased(KeyEvent e)
	{	
	}

	public void keyTyped(KeyEvent e)
	{
		number = e.getKeyChar();
		repaint();
	}//end method keyTyped
	
	public void paint(Graphics g)
   {
		super.paint(g);
 
      switch(number)
      {
      	case '0':
       	case '1':
       	case '2':
       	case '3':
       	case '4':
       	case '5':
       	case '6':
       	case '7':
       	case '8':
       	case '9':
					g.drawString("You Typed a NUMBER", 50, 50);
					break;
			default:
					g.drawString("Type a number from 0 to 9", 50, 50);
      }//end switch(number)
		
   }//end method paint
	
}//end class OneNum