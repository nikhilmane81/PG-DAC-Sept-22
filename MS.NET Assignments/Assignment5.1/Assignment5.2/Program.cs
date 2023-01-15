namespace Assignment5._2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee[] arr = new Employee[] { new Employee() {EmpNo=1,Name="Nikhil" },
                                              new Employee() {EmpNo=2, Name="Mayur"},
                                              new Employee() {EmpNo=3, Name="Sohail"},
                                              new Employee() {EmpNo=4, Name="Swati"},
                                              new Employee() {EmpNo=5, Name="Audrey"}
            }; 
            List<Employee> list = new List<Employee>();
            list.AddRange(arr);
            foreach(Employee item in list)
            {
                Console.WriteLine("Empid: " + item.EmpNo + " EmpName: " + item.Name);
            }
        }
    }



    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
    }
}