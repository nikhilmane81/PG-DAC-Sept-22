class Pattern32{
	public static void main(String argsp[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>i;j--)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=4; j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=-1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}