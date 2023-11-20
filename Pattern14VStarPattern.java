
public class Pattern14VStarPattern {

	public static void main(String[] args) {
		int rows=3;
		int right=5;
		int left=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=2*rows;j++)
			{
				if(j==left||j==right)
				{
				
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			right--;
			left++;
			
			System.out.println();
			}
		

	}

}
