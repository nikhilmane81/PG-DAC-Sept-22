namespace Assignment3
{
    internal class CodeRunner
    {
        static void Main()
        {
            Manager mng = new("Mayur", 23, "Manager");
            mng.Display();
            GeneralManager gm = new("Manish", 20, "General-Manager", "Free Food forever");
            gm.Display();
            Ceo ceo = new("Nikhil", 1);
            ceo.Display();
        }
    }


}