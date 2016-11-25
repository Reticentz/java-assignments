public class MyDivisionByZeroException extends Exception
{
	public MyDivisionByZeroException()
	{
		super("ERROR: / by zero.");
	}//end default constructor
	
	public MyDivisionByZeroException(String str)
	{
		super(str);
	}//end constructor
}//end class MyDivisionByZeroException