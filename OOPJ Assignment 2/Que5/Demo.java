/*
Write a program to implement a class “student” with the following members. Name of the student. Marks of the
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning
of the above. 
*/
class student
{
	String name;
	double mathMarks;
	double chemMarks;
	double physicsMarks;
	void setValues(String name, double mathMarks, double chemMarks, double physicsMarks)
	{
		this.name = name;
		this.mathMarks = mathMarks;
		this.chemMarks = chemMarks;
		this.physicsMarks = physicsMarks;
	}
	void totalAverage()
	{
		double totalAverage = (this.mathMarks + this.chemMarks + this.physicsMarks)/3;
		System.out.println("Average of all the marks is " + totalAverage);
	}
	void displayStudent()
	{
		System.out.println("Student name is "+ name);
		double totalMarks = (this.mathMarks + this.chemMarks + this.physicsMarks);
		System.out.println("Total marks of all the subjects is "+totalMarks);
	}
}
public class Demo
{
	public static void main(String [] args)
	{
		student stud1 = new student();
		stud1.setValues("Nikhil",67,45,90);
		stud1.totalAverage();
		stud1.displayStudent();
		System.out.println("=======================================");
		student stud2 = new student();
		stud2.setValues("Rasika",95,48,56);
		stud2.totalAverage();
		stud2.displayStudent();
	}
}