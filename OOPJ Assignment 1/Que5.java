//Program to convert given days into Years months and days
import java.util.*;
public class Que5
{
       public static void main(String[] args) 
	   {
		int days, weeks, months, years;
        int counter = 0;
		int counter1 = 0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        years = input/365;
		months = (input%365)/30;
		weeks = ((input%365)%30)/7;
		days = ((input%365)%30)%7;
		System.out.println("Years"+years);
		System.out.println("months"+months);
		System.out.println("days"+days);
		}
}
