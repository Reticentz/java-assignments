//Zachary Price
//Chapter 3, #7

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Chap3_7
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("Chap3_7Data.txt"));
		
		PrintWriter outFile = new PrintWriter("Chap3_7Output.txt");
		
		double increase1, increase2, increase3, salary1, salary2, salary3;
		
		String firstName1, firstName2, firstName3, lastName1, lastName2, lastName3;
		
		lastName1 = inFile.next();
		firstName1 = inFile.next();
		salary1 = inFile.nextDouble();
		increase1 = inFile.nextDouble();
		
		lastName2 = inFile.next();
		firstName2 = inFile.next();
		salary2 = inFile.nextDouble();
		increase2 = inFile.nextDouble();
		
		lastName3 = inFile.next();
		firstName3 = inFile.next();
		salary3 = inFile.nextDouble();
		increase3 = inFile.nextDouble();
		
		increase1 = salary1 * (increase1 / 100);
		increase2 = salary2 * (increase2 / 100);
		increase3 = salary3 * (increase3 / 100);
		
		outFile.printf("%s %s %.2f%n", firstName1, lastName1, (salary1 + increase1));
		outFile.printf("%s %s %.2f%n", firstName2, lastName2, (salary2 + increase2));
		outFile.printf("%s %s %.2f", firstName3, lastName3, (salary3 + increase3));
		
		inFile.close();
		
		outFile.close();
		
	}//end method main
	
}//end class Chap3_7