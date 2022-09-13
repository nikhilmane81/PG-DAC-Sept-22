class Pattern9{
	public static void main(String[] args) {
		int alpha = 65;
		for(int i=0;i<6;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(j+alpha)+" ");
			}
			System.out.println();
		}
  }
}