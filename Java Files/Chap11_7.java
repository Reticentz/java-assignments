// Zachary Price
// Chapter 11, #7

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Chap11_7 extends JFrame implements ActionListener
{
    private JTextField displayText = new JTextField(30);
    private JButton[] button = new JButton[17];

    private String[] keys = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", "C", ".", "+",
									 "="};

    private String numStr1 = "";
    private String numStr2 = "";

    private char op;
    private boolean firstInput = true, onlyOneDecimal = false;

    public Chap11_7()
    {
        setTitle("My Calculator");
        setSize(230, 230);
        Container pane = getContentPane();

        pane.setLayout(null);

        displayText.setSize(200, 30);
        displayText.setLocation(10, 10);
        pane.add(displayText);

        int x, y;

        x = 10;
        y = 40;

        for (int ind = 0; ind < 17; ind++)
        {
            button[ind] = new JButton(keys[ind]);
            button[ind].addActionListener(this);
            button[ind].setSize(50, 30);
            button[ind].setLocation(x, y);
            pane.add(button[ind]);
            x = x + 50;

            if ((ind + 1) % 4 == 0)
            {
                x = 10;
                y = y + 30;
            }
        }
		  
        button[16].setSize(200, 30);

        this.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            }
        );

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String resultStr;
        String str =
            String.valueOf(e.getActionCommand());

        char ch = str.charAt(0);

        switch (ch)
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
            if (firstInput)
            {
                numStr1 = numStr1 + ch;
                displayText.setText(numStr1);
            }
            else
            {
                numStr2 = numStr2 + ch;
                displayText.setText(numStr2);
            }
            break;

        case '+':
        case '-':
        case '*':
        case '/':
            op = ch;
            firstInput = false;
				onlyOneDecimal = false;
            break;

        case '=':
            resultStr = evaluate();
            displayText.setText(resultStr);
            numStr1 = resultStr;
            numStr2 = "";
            firstInput = false;
            break;

        case 'C':
            displayText.setText("");
            numStr1 = "";
            numStr2 = "";
            firstInput = true;
				onlyOneDecimal = false;
				break;
				
		  case '.':
		  		if (onlyOneDecimal == false && firstInput == true)
				{
		  			numStr1 = numStr1 + ".";
					displayText.setText(numStr1);
				}
				
				if (onlyOneDecimal == false && firstInput == false)
				{
		  			numStr2 = numStr2 + ".";
					displayText.setText(numStr2);
				}
				onlyOneDecimal = true;
        }
    }

    private String evaluate()
    {
        final char beep = '\u0007';

        try
        {
            double num1 = Double.parseDouble(numStr1);
            double num2 = Double.parseDouble(numStr2);
            double result = 0;

            switch (op)
            {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
					 
					 if (num2 == 0)
					 		throw new MyDivisionByZeroException();
            }

            return String.valueOf(result);
        }
		  catch (MyDivisionByZeroException zach)
		  {
		  		System.out.print(beep);
				return zach.toString();
		  }
        catch (ArithmeticException e)
        {
            System.out.print(beep);
            return "E R R O R: " + e.getMessage();
        }
        catch (NumberFormatException e)
        {
            System.out.print(beep);
            if (numStr1.equals(""))
               return "E R R O R: Invalid First Number" ;
            else
               return "E R R O R: Invalid Second Number" ;
        }
        catch (Exception e)
        {
            System.out.print(beep);
            return "E R R O R";
        }
    }

    public static void main(String[] args)
    {
		Chap11_7 C = new Chap11_7();
    }
}





