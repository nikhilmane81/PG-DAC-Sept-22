class Que7
{
	public static void main(String [] args)
	{
		int num1 = 13;
		int num2 = 15;
		System.out.println("Before swapping the numbers are as follows");
		System.out.println("first number "+ num1);
		System.out.println("Second number "+ num2);
		
		//Mathematic operation to swap numbers
		num1 = num1-num2;
		num2 = num1+num2;
		num1 = num2-num1;
		System.out.println("Before swapping the numbers are as follows");
		System.out.println("first number "+ num1);
		System.out.println("Second number "+ num2);
}
}