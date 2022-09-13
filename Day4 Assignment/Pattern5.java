class Pattern5{
	public static void main(String args[]){
		int alpha = 65; //ASCII value
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(alpha));
			}
			alpha++;
			System.out.println();
		}
	}
}