﻿namespace Assignment3
{
    internal class CodeRunner
    {
        static void Main()
        {
            Manager mng = new("Mayur", 23, "Manager",25000);
            mng.Display();
            GeneralManager gm = new("Manish", 20, "General-Manager", "Free Food forever",56000);
            gm.Display();
            Ceo ceo = new("Nikhil", 1,95000);
            ceo.Display();
        }
    }


}