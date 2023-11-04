
public class Pattern6MirroredArrowShapeStarPattern {

	public static void main(String[] args) {
		final int rows=9;
		int spaces= 5;
		int stars=1;
		for(int i=1;i<=rows;i++)// total times(rows)
	{
			if(i<=5)// upper part, left side
			{
				for(int j=1;j<spaces;j++)
				{
					System.out.print(" ");
				}
				spaces--;
				
				
			
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			
			stars++;
			
			}
			
			
			
			
			System.out.println("");
	}
		

	}

}
