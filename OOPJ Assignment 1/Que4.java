import java.util.Scanner;
public class Que4 {
	void interestcalc(double principle, double rate, int years)
	{
		rate = rate/100;
		double amount = principle*(1+(rate*years));
		System.out.println("Your total amount including interest is "+amount);
	}
	public static void main(String[] args)
	 {
		Que4 obj = new Que4();
		double principle;
		//double amount;
		double rate;
		int years;
		Scanner sc = new Scanner(System.in);
		System.out.println("This is simple interest calculator");
		System.out.println("Please enter Principle amount ");
		principle = sc.nextDouble();
		System.out.println("Please enter rate of interest per annum in %");
		rate = sc.nextDouble();
		System.out.println("Enter for how many years you wish to invest");
		years = sc.nextInt();
		obj.interestcalc(principle, rate, years);
	}
}
