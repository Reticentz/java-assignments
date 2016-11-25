import java.util.*;

public class Number
{

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		double number;
		
		System.out.print("Please enter a floating point number : ");
		
		number = keyboard.nextDouble();
		
		System.out.println("The number " + number + " rounded to the nearest integer = " + (int)(number + .5));
		
	}//end method main
	
}//end class Number