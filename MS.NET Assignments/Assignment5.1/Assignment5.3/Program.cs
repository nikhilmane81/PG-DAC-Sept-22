namespace Assignment5._3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Employee> emp = new List<Employee>();
            emp.Add(new Employee() {EmpNo=1, Name="Nikhil" });
            emp.Add(new Employee() { EmpNo = 2, Name = "Audrey" });
            emp.Add(new Employee() { EmpNo = 3, Name = "Sneha" });
            emp.Add(new Employee() { EmpNo = 5, Name = "Vikram" });


            Employee[] arr = emp.ToArray();
            foreach (Employee e in arr)
            {
                Console.WriteLine("Empid: " + e.EmpNo + " EmpName: " + e.Name);
            }
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
    }
}