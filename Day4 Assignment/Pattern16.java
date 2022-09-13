class Pattern16{
	public static void main(String args[]){
		int count=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count);
				count--;
			}
		count=5;
		System.out.println();
		}
	}
	
}


/*
5
5 4
5 4 3
5 4 3 2 
5 4 3 2 1
*/