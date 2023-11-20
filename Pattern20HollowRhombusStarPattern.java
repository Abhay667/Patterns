
public class Pattern20HollowRhombusStarPattern {

	public static void main(String[] args) {
		int rows=6;
		int left= 6;
		int right=4;
		for(int i=1;i<=6;i++ )
		{
			for(int j=1;j<=6;j++)
			{
				
				if((i==1&&j>=4)||(i==4&&j<=3)||(j==right)||j==left &&i<=4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				 
			
			}
			right--;
			left--;
			System.out.println();
			
		}
		
		
		

	}

}
