import java.util.*;
class Que6
{
	double FertoCel(double temp)
	{
		double cel = (5*(temp-32)/9);
		return cel;
	}
	public static void main(String [] args)
	{
		Que6 obj = new Que6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in Fehrenheit");
		double temp = sc.nextDouble();
		System.out.println("Conversion value in C is ");
		System.out.format("%.3f", temp); //formate specifier
	}
}