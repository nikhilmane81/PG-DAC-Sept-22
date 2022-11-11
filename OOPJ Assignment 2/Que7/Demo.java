/*
Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the
product. power() method that takes two integer numbers as parameter and returns the power of first number to
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four
methods of MathOperation class by providing entered numbers and prints the return values of every method. 
*/
import java.util.*;
class MathOperation
{
	static double num1;
	static double num2;
	public static double add(double num1, double num2)
	{
		return (num1 + num2);
	}
	static double substract(double num1, double num2)
	{
		if(num1>num2)
			return (num1 - num2);
		else
			return (num2 - num1);
	}
	static double multiply(double num1, double num2)
	{
		return (num1*num2);
	}
	static double power(double num1, double num2)
	{
		return (Math.pow(num1, num2));
	}
	
}
public class Demo extends MathOperation
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		MathOperation obj = new MathOperation();
		System.out.println(add(num1, num2));
		System.out.println(substract(num1, num2));
		System.out.println(multiply(num1, num2));
		System.out.println(power(num1, num2));
	}
}