/*
Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply
two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to
initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the
imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 3+2i and 4-
2i; (ii) to print the sum and product of those numbers.
*/
import java.util.*;
class Complex
{
	int real, img;
	Complex()
	{
		this.real =0;
		this.img =0;
	}
	Complex(int r, int i)
	{
		this.real = r;
		this.img = i;
	}
	/*
	Constructor for instantiating user defined values
	Complex()
	{
		Scanner sc = new Scanner(System.in);
		this.real = sc.nextInt();
		this.img = sc.nextInt();
	}*/
	void add(Complex obj, Complex obj1)
	{
		Complex res= new Complex();
		res.real = obj.real + obj1.real;
		res.img = obj.img + obj1.img;
		System.out.println("Sum of two complex numbers is as follows");
		System.out.println(res.real + " + " +res.img+"i");
	}
	void product(Complex obj, Complex obj1)
	{
		Complex res= new Complex();
		res.real = obj.real * obj1.real;
		res.img = obj.img * obj1.img;
		System.out.println("Product of two complex number is as follows");
		System.out.println(res.real + " + " +res.img+"i");
	}
	/*void display()
	{
		System.out.println(this.real + " +i" + this.img);
	}*/
}
public class Demo
{
	public static void main(String [] args)
	{
		Complex c1 = new Complex(3,2);
		Complex c2 = new Complex(4,2);
		Complex c3 = new Complex();
		c3.add(c1,c2);
		c3.product(c1,c2);
		//c3.display();
	}
}