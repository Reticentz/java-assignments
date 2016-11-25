public class TestProgDate
{
    public static void main(String[] args)
    {
        Date date1 = new Date(5, 24, 2012);
        Date date2 = new Date(2, 25, 1992);
		  Date date3 = new Date();
		  
		  date3.setDate(1, 15, 2011);
		  System.out.println("date1: " + date1);
		  System.out.println("date2: " + date2);
		  System.out.println("date3: " + date3);
		  date3.setMonth(2);
		  date3.setDay(16);
		  date3.setYear(1993);
		  
		  System.out.println("date3 after sets: " + date3);
		  System.out.println("date1 daysPassed: " + date1.daysPassed());
		  System.out.println("date2 leapYear: " + date2.leapYear());
		  System.out.println("date2 daysInMonth: " + date2.daysInMonth(date2.getMonth()));
		  System.out.println("date3 leapYear: " + date3.leapYear());
		  System.out.println("date3 daysInMonth: " + date3.daysInMonth(date3.getMonth()));
		  System.out.println("date3 daysPassed: " + date3.daysPassed());
		  System.out.println("date3 daysRemaining: " + date3.daysRemaining());
		  
		  date3.calculateNewDate(1460);
		  date1.makeCopy(date3);
		  
		  System.out.println("date3 after calculateNewDate: " + date3);
		  System.out.println("date1 makeCopy of date3: " + date1);
		  System.out.println("date2 getCopy: " + date2.getCopy());
    }//end main
}//end class TestProgDate