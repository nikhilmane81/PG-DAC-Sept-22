using System.Diagnostics.Metrics;

namespace Assignment02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp1 = new Employee("Sunil",4000,10);
            emp1.Display(emp1);
            Employee emp2 = new Employee("Gajala", 56000, 12);
            emp2.Display(emp2);
            Employee emp3 = new Employee("Suresh");
            emp3.Display(emp3);
            Employee emp4 = new Employee();
            emp4.Display(emp4);

            Console.WriteLine(emp4.Empno);
            Console.WriteLine(emp3.Empno);
            Console.WriteLine(emp2.Empno);
            Console.WriteLine(emp1.Empno);
        }
    }
    public class Employee
    {
        static int count = 0;
        public Employee()
        { }
        public Employee(string name = "Demo", decimal basic = 1000, short deptno = 100)
        {
            this.empno = ++count;
            this.Name = name;
            this.Basic = basic;
            this.Deptno = deptno;
        }

        public void Display(Employee emp)
        {
            Console.WriteLine("[EmpNo: " + emp.Empno + "] [EmpName: " + emp.Name + "] [ BasicSalary: " + emp.Basic + "] [ DeptNo: " + emp.Deptno + "] [ Gross Salary is: " + GetNetSalary(emp) + "]");
        }

        public int GetNetSalary(Employee emp)
        {
            int Netsalary = (int)emp.basic + 2000;

            return Netsalary;
        }

        private string name = "";
        public string Name
        {
            set
            {
                if (value.Length <= 0)
                {
                    Console.WriteLine("Not acceptable");
                }
                else
                {
                    name = value;
                }
            }
            get
            {
                return name;
            }
        }

        private int empno;
        public int Empno //Read-Only
        {
           
            get
            {
                return empno;
            }
        }
        private decimal basic;
        public decimal Basic
        {
            set
            {
                if (value < 100000 && value > 0)
                {
                    basic = value;
                }
                else
                {
                    Console.WriteLine("Value between 0 and 10 are only accepted");
                }

            }
            get
            {
                return basic;
            }
        }
        private short deptno;

        public short Deptno
        {
            set
            {
                if (value > 0)
                {
                    deptno = value;
                }
                else
                {
                    Console.WriteLine("Value must be greater than zero");
                }
            }
            get
            {
                return deptno;
            }

        }
    }
}