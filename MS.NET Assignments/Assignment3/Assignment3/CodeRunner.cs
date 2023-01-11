namespace Assignment3
{
    internal class CodeRunner
    {
        static void Main(string[] args)
        {
            Manager mng = new Manager("Mayur", 23, "Manager");
            mng.Display();
            GeneralManager gm = new GeneralManager("Manish", 20, "Genral-Manager", "Free Food forever");
            gm.Display();
            Ceo ceo = new Ceo("Nikhil", 1);
            ceo.Display();
        }
    }


}