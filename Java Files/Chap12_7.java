//Zachary Price
//Chapter 12, #7

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap12_7 extends JApplet implements ActionListener
{
	private JMenuBar menuMB = new JMenuBar();
	private JMenu fileM, editM, shapeM, colorM, numberM;
	private JMenuItem exitI, refreshI, aboutI;
	private JMenuItem circleI, ovalI, squareI, rectangleI;
	private JMenuItem redI, blueI, greenI, yellowI, pinkI, whiteI, cyanI, magentaI;
	private JMenuItem oneI, tenI, twentyI, thirtyI, fortyI;
	private Color currentColor = Color.white;
	private int currentNumber = 1, currentShape = 0, x = 50, y = 50, width, height;
	
	public void init()
	{
		Container pane = getContentPane();
		
		pane.setLayout(new BorderLayout());
		pane.setBackground(Color.black);
		setJMenuBar(menuMB);
		setFileMenu();
		setEditMenu();
		setSize(300, 400);
		
	}
	
	public void setFileMenu()
	{
		fileM = new JMenu("File");
		exitI = new JMenuItem("Exit");
		refreshI = new JMenuItem("Refresh");
		aboutI = new JMenuItem("About");
		menuMB.add(fileM);
		fileM.add(exitI);
		fileM.add(refreshI);
		fileM.add(aboutI);
		exitI.addActionListener(this);
		refreshI.addActionListener(this);
		aboutI.addActionListener(this);
	}
	
	public void setEditMenu()
	{
		editM = new JMenu("Edit");
		shapeM = new JMenu("Shape");
		colorM = new JMenu("Color");
		numberM = new JMenu("Number of Figures");
		circleI = new JMenuItem("Circle");
		ovalI = new JMenuItem("Oval");
		squareI = new JMenuItem("Square");
		rectangleI = new JMenuItem("Rectangle");
		redI = new JMenuItem("Red");
		blueI = new JMenuItem("Blue");
		greenI = new JMenuItem("Green");
		yellowI = new JMenuItem("Yellow");
		pinkI = new JMenuItem("Pink");
		whiteI = new JMenuItem("White");
		cyanI = new JMenuItem("Cyan");
		magentaI = new JMenuItem("Magenta");
		oneI = new JMenuItem("One");
		tenI = new JMenuItem("Ten");
		twentyI = new JMenuItem("Twenty");
		thirtyI = new JMenuItem("Thirty");
		fortyI = new JMenuItem("Forty");
		menuMB.add(editM);

		circleI.addActionListener(this);
		ovalI.addActionListener(this);
		squareI.addActionListener(this);
		rectangleI.addActionListener(this);
		redI.addActionListener(this);
		blueI.addActionListener(this);
		greenI.addActionListener(this);
		yellowI.addActionListener(this);
		pinkI.addActionListener(this);
		whiteI.addActionListener(this);
		cyanI.addActionListener(this);
		magentaI.addActionListener(this);
		oneI.addActionListener(this);
		tenI.addActionListener(this);
		twentyI.addActionListener(this);
		thirtyI.addActionListener(this);
		fortyI.addActionListener(this);
		
		editM.add(shapeM);
		editM.add(colorM);
		editM.add(numberM);
		shapeM.add(circleI);
		shapeM.add(ovalI);
		shapeM.add(squareI);
		shapeM.add(rectangleI);
		colorM.add(redI);
		colorM.add(blueI);
		colorM.add(greenI);
		colorM.add(yellowI);
		colorM.add(pinkI);
		colorM.add(whiteI);
		colorM.add(cyanI);
		colorM.add(magentaI);
		numberM.add(oneI);
		numberM.add(tenI);
		numberM.add(twentyI);
		numberM.add(thirtyI);
		numberM.add(fortyI);
	}
	
	public void paint(Graphics g)
	{
		int counter = 1, i;
		
		super.paint(g);
		g.setColor(currentColor);
		
		if (currentShape == 0 || currentShape == 2)
		{
			width = 25;
			height = 25;
		}
			else
			{
				width = 75;
				height = 25;
			}
			
		while (counter <= currentNumber)
		{
			switch (currentShape)
			{
				case 0:
					g.drawOval(x, y, width, height);
					break;
					
				case 1:
					g.drawOval(x, y, width, height);
					break;
					
				case 2:
					g.drawRect(x, y, width, height);
					break;
				
				case 3:
					g.drawRect(x, y, width, height);
					break;
			}
			x = x + 5;
			y = y + 5;
			
			if (currentShape == 0 || currentShape == 2)
			{
				width = width + 10;
				height = height + 10;
			}
				else
				{
					width = width + 20;
					height = height + 10;
				}
				
			counter++;
		}
		
		x = 50;
		y = 50;
		
		if (currentShape == 0 || currentShape == 2)
		{
			width = 25;
			height = 25;
		}
			else
			{
				width = 75;
				height = 25;
			}
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JMenuItem mItem = (JMenuItem) e.getSource();
		
		if (mItem == circleI)
		{
			currentShape = 0;
		}
			else if (mItem == ovalI)
			{
				currentShape = 1;
			}
				else if (mItem == squareI)
				{
					currentShape = 2;
				}
					else if (mItem == rectangleI)
					{
						currentShape = 3;
					}
		
		if (mItem == oneI)
		{
			currentNumber = 1;
		}
			else if (mItem == tenI)
			{
				currentNumber = 10;
			}
				else if (mItem == twentyI)
				{
					currentNumber = 20;
				}
					else if (mItem == thirtyI)
					{
						currentNumber = 30;
					}
						else if (mItem == fortyI)
						{
							currentNumber = 40;
						}
						
		if (mItem == redI)
		{
			currentColor = Color.red;
		}
			else if (mItem == blueI)
			{
				currentColor = Color.blue;
			}
				else if (mItem == greenI)
				{
					currentColor = Color.green;
				}
					else if (mItem == yellowI)
					{
						currentColor = Color.yellow;
					}
						else if (mItem == pinkI)
						{
							currentColor = Color.pink;
						}
							else if (mItem == whiteI)
							{
								currentColor = Color.white;
							}
								else if (mItem == cyanI)
								{
									currentColor = Color.cyan;
								}
									else if (mItem == magentaI)
									{
										currentColor = Color.magenta;
									}
		if (mItem == refreshI)
			repaint();
			
		if (mItem == aboutI)
			JOptionPane.showMessageDialog(null, "This creation made possible by Zachary Price, bitches!", "About", JOptionPane.INFORMATION_MESSAGE);
			
		if (mItem == exitI)
			System.exit(0);
			
		repaint();
	}
}