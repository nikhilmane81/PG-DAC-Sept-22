class Pattern2{
	public static void main(String args[]){
		int counter=0;
		int alpha=65; //ASCII value
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(alpha+j));
			}
			System.out.println();
		}
	}
}