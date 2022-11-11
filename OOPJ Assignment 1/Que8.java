import java.util.Scanner;
class Que8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hra=0;
        double da=0;
        System.out.println("Please enter your basic salary to find the gross salary");
        double basic = sc.nextInt();
        if(basic<10000)
        {
            hra = basic*0.1;
            da = basic*0.9;
        }
        else if(basic>=10000)
        {
            hra = 2000;
            da = basic*0.98;
        }
        double Gross_Salary = (hra+da);
        System.out.println("Gross salary is "+ Gross_Salary);
    }
}