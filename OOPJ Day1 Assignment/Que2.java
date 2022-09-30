import java.util.*;
public class Que2 {
	double area(double input)
	{
		return (input*input*3.1415);
	}
	double circumference(double input)
	{
		return (2*input*3.1415);
	}
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of the circle");
	double input = sc.nextDouble();
	Que2 obj = new Que2();
	System.out.println("Area of circle is "+obj.area(input));
	System.out.println("Area of circle is "+obj.circumference(input));
	}
}
