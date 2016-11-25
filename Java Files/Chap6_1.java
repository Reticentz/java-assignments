//Zachary Price
//Chapter 6, #1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chap6_1 extends JFrame
{
	private JLabel testScoreL1, testScoreL2, testScoreL3, testScoreL4, weightL1, weightL2, weightL3, weightL4, totalL;
	private JTextField testScoreTF1, testScoreTF2, testScoreTF3, testScoreTF4, weightTF1, weightTF2, weightTF3, weightTF4, totalTF;
	private JButton calculateB, exitB, clearB;
	private CalculateHandler calculateHandler;
	private ExitHandler exitHandler;
	private ClearHandler clearHandler;
	
	public Chap6_1()
	{
		setTitle("Weighted Average");
		Container herro = getContentPane();
		herro.setLayout(new GridLayout(11, 2));
		
		testScoreL1 = new JLabel("Test Score 1: ", SwingConstants.RIGHT);
		testScoreL2 = new JLabel("Test Score 2: ", SwingConstants.RIGHT);
		testScoreL3 = new JLabel("Test Score 3: ", SwingConstants.RIGHT);
		testScoreL4 = new JLabel("Test Score 4: ", SwingConstants.RIGHT);
		weightL1 = new JLabel("Weight 1: ", SwingConstants.RIGHT);
		weightL2 = new JLabel("Weight 2: ", SwingConstants.RIGHT);
		weightL3 = new JLabel("Weight 3: ", SwingConstants.RIGHT);
		weightL4 = new JLabel("Weight 4: ", SwingConstants.RIGHT);
		totalL = new JLabel("Weighted Average: ", SwingConstants.RIGHT);
		testScoreTF1 = new JTextField(10);
		testScoreTF2 = new JTextField(10);
		testScoreTF3 = new JTextField(10);
		testScoreTF4 = new JTextField(10);
		weightTF1 = new JTextField(10);
		weightTF2 = new JTextField(10);
		weightTF3 = new JTextField(10);
		weightTF4 = new JTextField(10);
		totalTF = new JTextField(10);
		calculateB = new JButton("Calculate");
		exitB = new JButton("Exit");
		clearB = new JButton("Clear");
		calculateHandler = new CalculateHandler();
		exitHandler = new ExitHandler();
		clearHandler = new ClearHandler();
		
		testScoreTF1.addActionListener(calculateHandler);
		testScoreTF2.addActionListener(calculateHandler);
		testScoreTF3.addActionListener(calculateHandler);
		testScoreTF4.addActionListener(calculateHandler);
		weightTF1.addActionListener(calculateHandler);
		weightTF2.addActionListener(calculateHandler);
		weightTF3.addActionListener(calculateHandler);
		weightTF4.addActionListener(calculateHandler);
		totalTF.addActionListener(calculateHandler);
		calculateB.addActionListener(calculateHandler);
		exitB.addActionListener(exitHandler);
		clearB.addActionListener(clearHandler);
		
		herro.add(testScoreL1);
		herro.add(testScoreTF1);
		herro.add(weightL1);
		herro.add(weightTF1);
		herro.add(testScoreL2);
		herro.add(testScoreTF2);
		herro.add(weightL2);
		herro.add(weightTF2);
		herro.add(testScoreL3);
		herro.add(testScoreTF3);
		herro.add(weightL3);
		herro.add(weightTF3);
		herro.add(testScoreL4);
		herro.add(testScoreTF4);
		herro.add(weightL4);
		herro.add(weightTF4);
		herro.add(totalL);
		herro.add(totalTF);
		herro.add(calculateB);
		herro.add(clearB);
		herro.add(exitB);
		
		setSize(750, 450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}//end method Chap6_1

	private class CalculateHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double testScore1, testScore2, testScore3, testScore4, weight1, weight2, weight3, weight4, total;
			
			testScore1 = Double.parseDouble(testScoreTF1.getText());
			testScore2 = Double.parseDouble(testScoreTF2.getText());
			testScore3 = Double.parseDouble(testScoreTF3.getText());
			testScore4 = Double.parseDouble(testScoreTF4.getText());
			weight1 = Double.parseDouble(weightTF1.getText());
			weight2 = Double.parseDouble(weightTF2.getText());
			weight3 = Double.parseDouble(weightTF3.getText());
			weight4 = Double.parseDouble(weightTF4.getText());			
			total = (testScore1 * weight1) + (testScore2 * weight2) + (testScore3 * weight3) + (testScore4 * weight4);
			
			
		}//end actionPerformed
	}//end class CalculateHandler
	
	private class ExitHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}//end actionPerformed
	}//end class ExitHandler
	
	private class ClearHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			testScoreTF1.setText("");
			testScoreTF2.setText("");
			testScoreTF3.setText("");
			testScoreTF4.setText("");
			weightTF1.setText("");
			weightTF2.setText("");
			weightTF3.setText("");
			weightTF4.setText("");
			totalTF.setText("");
		}//end actionPerformed
	}//end class ClearHandler
	
	public static void main(String[] args)
	{
			Chap6_1 fred = new Chap6_1();	
	}//end method main
	
}//end class Chap6_1