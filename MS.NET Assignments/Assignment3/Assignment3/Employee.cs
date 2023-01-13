using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment3
{
    public abstract class Employee : IDbFuntions
    {
        static int count = 0;
        public Employee(string Name="", short DeptNo=0) {
            this.empNo = ++count;
            this.Name = Name;
            this.DeptNo = DeptNo;
        }
        private string name="";
        public string Name
        {
            get { return name; }
            set {
                if (value.Length > 0)
                {
                    name = value;
                }
                else
                {
                    Console.WriteLine("Value rejected");
                }
                }
        }
        private int empNo;
        public int EmpNo
        {
            
            get {
                return empNo; 
                }
        }
        private short deptNo;
        public short DeptNo
        {
            set
            {
                if (value > 0) 
                {
                deptNo = value;
                }
                else
                {
                    Console.WriteLine("Value need to be > 0");
                }
            }
            get { return deptNo; }  
        }

        protected decimal basic;
        public abstract decimal Basic
        { set;  get; }

        public abstract decimal CalcNetSalary();
        public abstract void Insert();
        public abstract void Update();
        public abstract void Delete();
        public abstract void Display();
    }
}
