class Pattern41{
	public static void main(String args[]){
		int count = 9;
		for(int i=0; i<9;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=9;j>i;j--)
			{
				System.out.print(count+" ");
			}
			System.out.println();
			count--;
		}
	}
}