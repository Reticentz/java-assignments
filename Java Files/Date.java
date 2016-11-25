public class Date
{
    private int dMonth;
    private int dDay;
    private int dYear;

   public Date()
   {
    	dMonth = 1;
      dDay = 1;
      dYear = 1900;
   }//end default constructor
	 
   public Date(int month, int day, int year)
   {
		dMonth = month;
      dDay = day;
      dYear = year;
   }//end constructor Date

   public void setDate(int month, int day, int year)
   {
		if (month < 1 || month > 12 || day < 1 || day > daysInMonth(month))
			System.out.println("Invalid date specified.");
		else
      	dMonth = month;
      	dDay = day;
      	dYear = year;
   }//end method setDate
	
	public void setMonth(int month)
	{
		if (month < 1 || month > 12)
			System.out.println("Invalid month specified.");
		else
			dMonth = month;
	}//end method setMonth

	public void setDay(int day)
	{
		if (day < 1 || day > daysInMonth(dMonth))
			System.out.println("Invalid day specified.");
		else
			dDay = day;
	}//end method setDay
	
	public void setYear(int year)
	{
		if (year > 9999)
			System.out.println("Invalid year specified.");
		else
			dYear = year;
	}//end method setYear
	
   public int getMonth()
   {
      return dMonth;
   }//end method getMonth

   public int getDay()
   {
      return dDay;
   }//end method getDay

   public int getYear()
   {
      return dYear;
   }//end method getYear
	
	public boolean leapYear()
	{
		if (dYear % 4 == 0 && dYear % 100 != 0 || dYear % 4 == 0 && dYear % 100 == 0 && dYear % 400 == 0)
			return true;
		return false;
	}//end method leapYear
	
	public int daysInMonth(int month)
	{
		if (month < 1 || month > 12)
			System.out.println("Invalid month passed in.");

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else
			if (month == 4 || month == 6 || month == 9 || month == 11)
				return 30;
			else
				if (month == 2 && leapYear() == true)
					return 29;
				else
					if (month == 2 && leapYear() == false)
						return 28;
		return 0;
	}//end method daysInMonth
	
	public int daysInYear(int year)
	{
		if (leapYear() == true)
			return 366;
		return 365;
	}//end method daysInYear
	
	public int daysPassed()
	{
		int counter = 0, x = 1;
		
		if (dDay <= daysInMonth(dMonth))
			counter = counter + dDay;
		
		while (x < dMonth)
		{
			counter = counter + daysInMonth(x);
			x++;
		}//end while
		
		return counter;
	}//end method daysPassed
	
	public int daysRemaining()
	{
		int counter = 0, x = 1, year = daysInYear(dYear);
		
		if (dDay <= daysInMonth(dMonth))
			counter = counter + dDay;
		
		while (x < dMonth)
		{
			counter = counter + daysInMonth(x);
			x++;
		}//end while
		
		return (year - counter);
	}//end method daysRemaining
	
	public void calculateNewDate(int days)
	{
		int counter = daysPassed() + days, originalDays = daysPassed();
		
		setMonth(1);
		
		while (counter > daysInMonth(dMonth))
		{	
			counter = counter - daysInMonth(dMonth);
			dMonth++;
			
			if (dMonth > 12)
			{
				dYear++;
				dMonth = 1;
			}//end if
		}//end while
		
		if (counter <= daysInMonth(dMonth))
		{
			dDay  = counter;
		}//end if
	}//end method calculateNewDate
	
	public void makeCopy(Date object)
	{
		dDay = object.dDay;
		dMonth = object.dMonth;
		dYear = object.dYear;
	}//end method makeCopy
	 
	public Date getCopy()
	{
		Date temp = new Date();
		temp.setDay(dDay);
		temp.setMonth(dMonth);
		temp.setYear(dYear);
		return temp;
	}//end method getCopy

   public String toString()
   {
      return (dMonth + "-" + dDay + "-" + dYear);
   }//end method toString
}//end class Date

