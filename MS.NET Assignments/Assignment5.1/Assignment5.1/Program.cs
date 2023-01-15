namespace Assignment5._1
{
    internal class Program
    {
        static void Main(string[] args)
        {
           SortedList<int, Employee> emp = new SortedList<int, Employee>();
            string response = "yes";
            int count = 0;
            while(response == "yes") 
            {
                Console.WriteLine("Enter id of employee");
                int eno = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter name of employee");
                string ename = Console.ReadLine();
                ++count;
                bool check = true;
                foreach(KeyValuePair<int,Employee >kvp in emp) //checking if empNo already exisit in values
                {
                    if (kvp.Value.EmpNo == eno)
                    {
                        Console.WriteLine("Emp No already exist, Emp details NOT added");
                        check = false;
                        break;
                    }
                   
                }
                if(check==false) //To skip adding when empNo already exist
                {
                    continue;
                }
                emp.Add(count, new Employee() { EmpNo = eno, Name = ename });
                Console.WriteLine("Type yes to add employee details");
                response = Console.ReadLine();

            }
            Display(emp);
            Search(emp);

            Console.WriteLine("Display details of Nth employee, enter value of N (int)");
            int n = int.Parse(Console.ReadLine());
            Display(emp,n);

           
            

        }

        static void Display(SortedList<int, Employee>emp)
        {
            foreach(KeyValuePair<int, Employee> kvp in emp)
            {
                Console.WriteLine("[ Emp No: "+kvp.Value.EmpNo+" ] and [ Emp Name: " + kvp.Value.Name+" ]");
            }
        }
        static void Display(SortedList<int, Employee>emp, int n)
        {

            foreach(KeyValuePair<int, Employee> kvp in emp)
            {
                if(kvp.Key==n)
                {
                    Console.WriteLine("[ Emp No: " + kvp.Value.EmpNo + " ] and [ Emp Name: " + kvp.Value.Name + " ]");
                    break;
                }
                else
                {
                    Console.WriteLine("Entered N out of bound for this list");
                }
            }
        }
        static void Search(SortedList<int, Employee>emp)
        {
            Console.WriteLine("Enter empNo to be searched");
            int sempno = int.Parse(Console.ReadLine());
            foreach(KeyValuePair<int, Employee> kvp in emp)
            {
                if(kvp.Value.EmpNo==sempno)
                {
                    Console.WriteLine("[ Emp No: " + kvp.Value.EmpNo + " ] and [ Emp Name: " + kvp.Value.Name + " ]");
                    break;
                }
                else
                {
                    Console.WriteLine($"No employee found with id {sempno}");
                }
            }
        }
    }

    








    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
    }
}