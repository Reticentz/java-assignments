import java.util.*;

public class TestScores
{

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{

		int test1, test2, test3, test4, test5;
		
		System.out.print("Please enter five test scores: ");
		
		test1 = keyboard.nextInt();
		
		test2 = keyboard.nextInt();
		
		test3 = keyboard.nextInt();
		
		test4 = keyboard.nextInt();
		
		test5 = keyboard.nextInt();
		
		System.out.print("The average test score is: " + (test1 + test2 + test3 + test4 + test5)/5);

	}//end method main
	
}//end class TestScores