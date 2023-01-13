using System.Reflection.Metadata.Ecma335;

namespace Assignment4._2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("How many employee you need to store ?");
            int empcount = int.Parse(Console.ReadLine());

            Employee[] arr = new Employee[empcount];

            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = new Employee();
                arr[i].Id = i;
                Console.WriteLine($"Enter name of Employee with id {i}:- ");
                arr[i].Name = Console.ReadLine();
                Console.WriteLine($"Enter Salary of Employee with id {i} ");
                arr[i].Salary= double.Parse(Console.ReadLine());
            }
            Display(arr);
            Console.WriteLine();
            HighSal(arr);

            Console.WriteLine("Enter id of employee to be searched :-");
            int id = int.Parse(Console.ReadLine());
            SearchEmp(arr,id);
          
        }

        static void SearchEmp(Employee [] arr,int id)
        {
            try
            {
                Console.WriteLine($"Employee with id {id}:- [ Emp Id:- " + arr[id].Id + " | Emp Name:- " + arr[id].Name + " | Emp Salary:- " + arr[id].Salary + " ]");
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
                Console.WriteLine($"Employee do not exist with id {id}");
            }
        }
        static void HighSal(Employee[] arr)
        {
            int i;
            double salary = 0;
            int empindex = 0;
            for (i = 0; i < arr.Length; i++)
            {
                if(arr[i].Salary>salary)
                {
                    salary = arr[i].Salary;
                    empindex = i;
                }
            }
            Console.WriteLine("Highest Salary Emp:- [ Emp Id:- " + arr[empindex].Id + " | Emp Name:- " + arr[empindex].Name + " | Emp Salary:- " + arr[empindex].Salary + " ]");
        }
        static void Display(Employee [] arr)
        {
            foreach (Employee emp in arr)
            {
                Console.WriteLine("[ Emp Id:- "+emp.Id+" | Emp Name:- "+emp.Name+" | Emp Salary:- " + emp.Salary+" ]");
            }
        }
    }


    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public double Salary { get; set; }

    }
}