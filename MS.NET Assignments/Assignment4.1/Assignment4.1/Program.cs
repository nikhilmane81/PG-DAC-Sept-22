namespace Assignment4._1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter number of Batches");
            int numB = int.Parse(Console.ReadLine());
            int[][] std = new int[numB][];
            for (int i = 0; i < std.Length; i++)
            {
                Console.WriteLine($"Enter number of student in the batch no:- {i}");
                int count = int.Parse(Console.ReadLine());
                std [i]= new int[count];
            }

            for (int i = 0; i < std.Length; i++)
            {
                for (int j = 0; j < std[i].Length; j++)
                {
                    Console.Write($"Enter value for Batch No :- {i} and Student No:- {j} = ");
                    std[i][j] = int.Parse(Console.ReadLine());
                }
                Console.WriteLine();
            }

            for (int i = 0; i < std.Length; i++)
            {
                for (int j = 0; j < std[i].Length; j++)
                {
                    Console.WriteLine("Batch number {0}  student {1} has marks {2}", i, j, std[i][j]);
                }
            }
        }
    }
}