//Phillip Martinez
//Java160
//Ch5 Question 6
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
//Add additional import statements as needed
public class Ch_5_6_sum_even_odd
{
static Scanner console = new Scanner(System.in);

static final int I = 20;

public static void main(String[] args)
{
int counter;
int number = 0, odd = 0, even = 0;

System.out.println("please enter integers");

for (counter = 1; counter <= I; counter++)
{
number = console.nextInt();
System.out.print(number + " ");

if (number % 2 == 0)
even = even + number;
else
odd = odd + number;


System.out.println();
System.out.println(" Total even is: " + even);
System.out.println(" Total odds is: " + odd);

}//endforloop
//print lines here or where they are????

}//endmethodmain()
}//endclassCh_5_6_sum_even_odd