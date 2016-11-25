public class test
{
public static void main(String[]args)
{
int loop = 0, variable = 1;
System.out.print("This is before the statement. Run: " + variable + "\n");
while (loop < 3)
{
System.out.print(variable);
loop++;
variable++;
}
}
}