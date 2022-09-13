class pattern37{
	public static void main(String args[])
	{
		for(int i=0;i<=9;i++)
		{
			for(int j=9;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}