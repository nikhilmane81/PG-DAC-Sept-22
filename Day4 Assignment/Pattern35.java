class pattern35{
	public static void main(String args[])
	{
		for(int i=0;i<=9;i++)
		{
			for(int j=9;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}