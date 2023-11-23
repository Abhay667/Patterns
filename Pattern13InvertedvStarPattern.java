
public class Pattern13InvertedvStarPattern {

	public static void main(String[] args) {
		
		final int rows=3;
		int right=3;
		int left=3;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=2*rows;j++)
			{
				if(j==right||j==left)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			right++;
			left--;
			System.out.println();
		}

	}

}
