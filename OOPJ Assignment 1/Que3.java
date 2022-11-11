import java.util.Scanner;
public class Que3 {
	public static void main(String [] args)
	{
		double[] arr = new double[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained out of 50");
		for(int i=0;i<arr.length;i++)
		{
			double marks = sc.nextDouble();
			arr[i]= marks;
		}
		System.out.println("Below are the marks you have entered");
		for (double element:arr)
		{
			System.out.print(" "+element);
		}
		System.out.println();
		double sum = 0;
		for (double element:arr)
		{
			sum = sum + element;
		}
		System.out.println("Sum of all the marks out of 250 is "+
		sum + "Percentage marks are"+ 
		((float)(sum/250)*100)+"%");
	}
}
