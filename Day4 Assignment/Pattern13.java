class Pattern13{
	public static void main(String[] args) {
		int alpha = 64; //ASCII value
		for(int i=0;i<6;++i)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(i+alpha)+" ");
			}
			System.out.println();
		}
  }
}
