using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment3
{
    public class Manager : Employee,IDbFuntions
    {



        public Manager(string Name="", short DeptNo = 0, string Designation = "Emp", decimal basic=0) : base(Name, DeptNo)
        {
            this.Designation= Designation;  
            this.basic= basic;
        }

        private string designation="";
        public string Designation
        {
            set
            {
                if(value.Length> 0)
                {
                    designation= value;
                }
                else
                {
                    Console.WriteLine("designation can not be blank");
                }
            }
            get
            { return designation; } 
        }


        public override decimal Basic 
        { set
            { 
            basic= value;
            } 
            get { return basic; }
        }

        public override decimal CalcNetSalary()
        {
            return Basic * 2 + 4390;
        }

        public override void Insert()
        {
            Console.WriteLine("Manager Insert()");
        }

        public override void Update()
        {
            Console.WriteLine("Manager Update()");
        }

        public override void Delete()
        {
            Console.WriteLine("Manager Delete()");
        }

        public override void Display()
        {
            Console.WriteLine("[ EmpNo= " + this.EmpNo + " Name= " + this.Name + "  DeptNo= " + this.DeptNo + " Basic= " + this.Basic+" Designation= " + this.Designation + " NetSalary= " + this.CalcNetSalary()+"]");
        }
    }
}
