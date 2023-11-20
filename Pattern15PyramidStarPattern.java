
public class Pattern15PyramidStarPattern {

	public static void main(String[] args) {
		int rows=3;
		int spaces=3;
		int stars=1;
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
			System.out.print(" ");	
			}
			
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*" +" "+" ");
			}
			stars++;
			spaces--;
			
			System.out.println();
			
			
		}
		
		

	}

}
