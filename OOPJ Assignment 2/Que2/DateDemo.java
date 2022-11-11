/*
Implement a class for “DateDemo”. Write member functions for (i) getting the previous day, (iv) getting the next
day, (iii) printing a day There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii)
day is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day, month are
initialized to user specified value but year is initialized to 1970; (iv) day, month and year are initialized to user
defined values. Also, write a main() function to (i) create a date object; (ii) print the next and the previous day. 
*/
import java.util.Date;
import java.time.LocalDate;
class DateDemo
{
	static final long MILLIS_IN_DAY = 1000*60*60*24;
	int day;
	int month;
	int year;
		DateDemo()
		{
			this.day = 01;
			this.month = 01;
			this.year = 1970;
		}
		DateDemo(int day, int month, int year)
		{
			this.day = day;
			this.month = month;
			this.year = year;
		}
		static void displayCurrentDate(DateDemo obj)
		{
			System.out.println("Day: "+obj.day+" Month: "+obj.month+" Year: "+obj.year);
		}
		private static LocalDate nextDay(LocalDate localdate)
		{
			return localdate.plusDays(1);
		}
		private static LocalDate previousDay(LocalDate localdate)
		{
			return localdate.minusDays(1);
		}
		public static void main(String [] args)
		{
			//DateDemo D1 = new DateDemo();
			//displayCurrentDate(D1);
			LocalDate today = LocalDate.now();
			System.out.println("Today     :: " + today);
			System.out.println("Next date :: " + nextDay(today));
			System.out.println("Prev date :: " + previousDay(today));
		}
}