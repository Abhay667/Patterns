
public class Pattern8InvertedPyramid {

	public static void main(String[] args) {
		final int rows=3;
		int stars=3;
		int spaces=1;
		for(int i =1;i<=rows;i++)
		{
			for(int j=1;j<spaces;j++)
			{
				System.out.print(" ");
			}
			spaces++;
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*" + " ");
			}
			stars--;
			System.out.println();
		}
		

	}

}
