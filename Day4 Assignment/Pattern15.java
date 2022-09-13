class Pattern15{
	public static void main(String args[]){
		int count=5;
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(count+" ");
				count--;
			}
			count =5;
			System.out.println();
		}
	}
}