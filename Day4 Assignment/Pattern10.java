class Pattern10{
	public static void main(String[] args) {
		int alpha = 64;
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print((char)(j+alpha)+" ");
			}
			System.out.println();
		}
  }
}
/*
	E
   D E
  C D E
 B C D E
A B C D E
*/