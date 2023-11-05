
public class Pattern6MirroredArrowShapeStarPattern {

	public static void main(String[] args) {
		final int rows=9;
		int spaces= 5;
		int stars=1;
		int spaces2=1;
		int stars2=5;
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
			
			if(i>5)
			{
			
			for(int j=1;j<=spaces2;j++)
			{
					System.out.print(" ");
					
			}
			spaces2++;
				
				for(int j=1;j<stars2;j++)
				{
					System.out.print("*");
				}
				
				stars2--;
			}
			
			
			System.out.println("");
	}
		

	}

}
