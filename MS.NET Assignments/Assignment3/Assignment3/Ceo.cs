﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment3
{
    public class Ceo : Employee,IDbFuntions
    {
        public Ceo(string Name="", short DeptNo = 0, decimal basic = 0) : base(Name, DeptNo)
        {
            this.basic = basic;
        }

        public override decimal Basic
        {
            set
            {
                basic = value;
            }
            get { return basic; }
        }

        public sealed override decimal CalcNetSalary()
        {
            return Basic * 5 + 45000;
        }

        public override void Insert()
        {
            Console.WriteLine("Ceo Insert()");
        }

        public override void Update()
        {
            Console.WriteLine("Ceo Update()");
        }

        public override void Delete()
        {
            Console.WriteLine("Ceo Delete()");
        }

        public override void Display()
        {
            Console.WriteLine("[ EmpNo= " + this.EmpNo + " Name= " + this.Name + "  DeptNo= " + this.DeptNo + " Basic= " + this.Basic + " NetSalary= " + this.CalcNetSalary() + "]");
        }
    }
}
