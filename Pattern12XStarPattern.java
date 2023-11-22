
public class Pattern12XStarPattern {

	public static void main(String[] args) {
		final int rows= 5;
		int right=5;
		int left=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
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
			left++;
			right--;
			System.out.println();
		}

	}

}
