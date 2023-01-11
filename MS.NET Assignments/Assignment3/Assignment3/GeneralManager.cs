﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment3
{
    public  class GeneralManager : Manager,IDbFuntions
    {

        public GeneralManager(string Name, short DeptNo, string Designation, string Perks) : base(Name, DeptNo, Designation)
        {
            this.Perks = Perks;
        }

        private string perks = "";
       // public string Perks { get; set; }
       public string Perks
        {
            set
            {
                if(value.Length> 0)
                {
                    perks = value;
                }
                else
                {
                    Console.WriteLine("Perks can't be blank");
                }
            }
            get { return perks; }
        }



        public override void Insert()
        {
            Console.WriteLine("GeneralManager Insert()");
        }

        public override void Update()
        {
            Console.WriteLine("GeneralManager Update()");
        }

        public override void Delete()
        {
            Console.WriteLine("GeneralManager Delete()");
        }

        public override void Display()
        {
            Console.WriteLine("[ EmpNo= " + this.EmpNo + " Name= " + this.Name + "  DeptNo= " + this.DeptNo + " Basic= " + this.Basic +" Designation= "+this.Designation +" NetSalary= " + this.CalcNetSalary()+" Perks= "+this.perks);
        }
    }
}
