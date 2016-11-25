//Zachary Price
//Chapter 12, #2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap12_2 extends JApplet implements ItemListener
{
	 private JRadioButton redRB, blueRB, greenRB, orangeRB, yellowRB, blackRB, magentaRB, cyanRB;
	 private JTextField textFieldTF = new JTextField(1);
	 private ButtonGroup ColorSelectGroup;
	 private Color currentColor = Color.black;
	 private String str;
	 
    public void init()
    {
	 	 Container pane = getContentPane();
		 pane.setLayout(null);
		 
		 textFieldTF.addKeyListener(new KeyAdapter()
		 {
			 public void keyTyped(KeyEvent e)
			 {
				 repaint();
			 }
		 });
		 textFieldTF.setSize(20, 20);
		 textFieldTF.setLocation(1, 1);
		 pane.add(textFieldTF);

		 redRB = new JRadioButton("Red");
		 orangeRB = new JRadioButton("Orange");
		 yellowRB = new JRadioButton("Yellow");
		 greenRB = new JRadioButton("Green");
		 cyanRB = new JRadioButton("Cyan");
		 blueRB = new JRadioButton("Blue");
		 blackRB = new JRadioButton("Black");
		 magentaRB = new JRadioButton("Magenta");
	
		 redRB.setSize(100, 30);
		 orangeRB.setSize(100, 30);
		 yellowRB.setSize(100, 30);
		 greenRB.setSize(100, 30);
		 cyanRB.setSize(100, 30);
		 blueRB.setSize(100, 30);
		 blackRB.setSize(100, 30);
		 magentaRB.setSize(100, 30);
		 
		 redRB.setLocation(300, 70);
		 orangeRB.setLocation(300, 100);
		 yellowRB.setLocation(300, 130);
		 greenRB.setLocation(300, 160);
		 cyanRB.setLocation(300, 190);
		 blueRB.setLocation(300, 220);
		 blackRB.setLocation(300, 250);
		 magentaRB.setLocation(300, 280);
		 
		 redRB.addItemListener(this);
		 orangeRB.addItemListener(this);
		 yellowRB.addItemListener(this);
		 greenRB.addItemListener(this);
		 cyanRB.addItemListener(this);
		 blueRB.addItemListener(this);
		 blackRB.addItemListener(this);
		 magentaRB.addItemListener(this);
		 
		 pane.add(redRB);
		 pane.add(orangeRB);
		 pane.add(yellowRB);
		 pane.add(greenRB);
		 pane.add(cyanRB);
		 pane.add(blueRB);
		 pane.add(blackRB);
		 pane.add(magentaRB);
		 
		 ColorSelectGroup = new ButtonGroup();
		 ColorSelectGroup.add(redRB);
		 ColorSelectGroup.add(orangeRB);
		 ColorSelectGroup.add(yellowRB);
		 ColorSelectGroup.add(greenRB);
		 ColorSelectGroup.add(cyanRB);
		 ColorSelectGroup.add(blueRB);
		 ColorSelectGroup.add(blackRB);
		 ColorSelectGroup.add(magentaRB);
    }
	 
	 public void itemStateChanged(ItemEvent e)
	 {
	 	 textFieldTF.setText(str);
		 
	 	 if (e.getSource() == redRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.red;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
	 	 if (e.getSource() == orangeRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.orange;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
	 	 if (e.getSource() == yellowRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.yellow;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
	 	 if (e.getSource() == greenRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.green;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
	 	 if (e.getSource() == cyanRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.cyan;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
	 	 if (e.getSource() == blueRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.blue;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
	 	 if (e.getSource() == blackRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.black;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
	 	 if (e.getSource() == magentaRB)
		 {
		 	 if (e.getStateChange() == ItemEvent.SELECTED)
			 	 currentColor = Color.magenta;
			 if (e.getStateChange() == ItemEvent.DESELECTED)
			 	 currentColor = Color.black;
		 }
		 repaint();
	 }
	 	 
	 public void paint(Graphics g)
	 {
	 	 char character = ' ';
		 
	 	 super.paint(g);
		 
		 str = textFieldTF.getText();
		 
		 if (str.length() > 0)
		 character = str.charAt(0);
		 
		 g.setColor(currentColor);
		 
		 switch (character)
		 {
		 	 case '0':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 		 g.fillRect(50, 100, 25, 150); //top left
		 		 g.fillRect(50, 75, 160, 25); //top
		 		 g.fillRect(50, 250, 25, 125); //bottom left
				 g.fillRect(50, 375, 160, 25); //bottom
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '1':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '2':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 	 	 g.fillRect(50, 225, 160, 25); //middle
		 		 g.fillRect(50, 75, 160, 25); //top
		 		 g.fillRect(50, 250, 25, 125); //bottom left
				 g.fillRect(50, 375, 160, 25); //bottom
			 break;
			 case '3':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 	 	 g.fillRect(50, 225, 160, 25); //middle
		 		 g.fillRect(50, 75, 160, 25); //top
				 g.fillRect(50, 375, 160, 25); //bottom
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '4':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 	 	 g.fillRect(50, 225, 160, 25); //middle
		 		 g.fillRect(50, 100, 25, 150); //top left
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '5':
		 	 	 g.fillRect(50, 225, 160, 25); //middle
		 		 g.fillRect(50, 100, 25, 150); //top left
		 		 g.fillRect(50, 75, 160, 25); //top
				 g.fillRect(50, 375, 160, 25); //bottom
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '6':
		 	 	 g.fillRect(50, 225, 160, 25); //middle
		 		 g.fillRect(50, 100, 25, 150); //top left
		 		 g.fillRect(50, 75, 160, 25); //top
		 		 g.fillRect(50, 250, 25, 125); //bottom left
				 g.fillRect(50, 375, 160, 25); //bottom
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '7':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 		 g.fillRect(50, 75, 160, 25); //top
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '8':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 	 	 g.fillRect(50, 225, 160, 25); //middle
		 		 g.fillRect(50, 100, 25, 150); //top left
		 		 g.fillRect(50, 75, 160, 25); //top
		 		 g.fillRect(50, 250, 25, 125); //bottom left
				 g.fillRect(50, 375, 160, 25); //bottom
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 case '9':
			 	 g.fillRect(185, 100, 25, 150); //top right
		 	 	 g.fillRect(50, 225, 160, 25); //middle
		 		 g.fillRect(50, 100, 25, 150); //top left
		 		 g.fillRect(50, 75, 160, 25); //top
				 g.fillRect(50, 375, 160, 25); //bottom
		 		 g.fillRect(185, 250, 25, 125); //bottom right
			 break;
			 default:
			 	 g.drawString("Please type a number.", 50, 200);
			 break;
		 }
		 
		 textFieldTF.setText("");
	 }
}
