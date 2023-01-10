namespace Assignment1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee o1 = new Employee(1, "Amol", 6000, 10);
            o1.display(o1);

            //Console.WriteLine(o1.GetNetSalary(o1));
           // Console.WriteLine(o1.Deptno);
            Employee o2 = new Employee(22, "Sunil", 4000);
            o2.display(o2);
           // Console.WriteLine(o2.GetNetSalary(o2));
            //Console.WriteLine("Sunil dept should be 100--->"+o2.Deptno); //Test
            Employee o3 = new Employee(123, "Amol");
            o3.display(o3);
            Employee o4 = new Employee(30);
            o4.display(o4);
            Employee o5 = new Employee();
            o5.display(o5);
        }
    }
    public class Employee
    {
        public Employee()
        { }
        public Employee(int empno=10, string name="Demo", decimal basic=1000, short deptno=100)
        {
            this.Empno = empno;
            this.Name = name;
            this.Basic = basic;
            this.Deptno = deptno;
        }

        public void display(Employee emp)
        {
            Console.WriteLine("[EmpNo: "+emp.empno+" EmpName: "+emp.Name+" BasicSalary: "+emp.basic+" DeptNo: "+emp.deptno+ " Gross Salary is: "+ GetNetSalary(emp)+"]");
        }

        public int GetNetSalary(Employee emp)
        {
            int Netsalary = (int)emp.basic + 2000;

            return Netsalary;
        }

        private string name="";
        public string Name
        {
            set
            {
                if(value.Length<=0)
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
        public int Empno
        {
            set
            {
                if(value>0)
                {
                    empno = value;
                }
                else
                {
                    Console.WriteLine("Only Value greater than zero is accepted");
                }
            }
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
                if(value<10000 && value>0)
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
                if(value>0)
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