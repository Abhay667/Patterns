
public class Pattern9DiamondStarPattern {

	public static void main(String[] args) {
int spaces=2;
int stars=1;
		for(int i=1;i<=5;i++)
		{
			if(i<3)
			{
				for(int j=1;j<=spaces;j++)
				{
					System.out.print(" ");
				}
				spaces--;
				for(int j=1;j<=stars;j++)
				{
					System.out.print("*" +" ");
				}
				stars++;
				
			}
			
			else
			{
				for(int j=1;j<=spaces;j++)
				{
					System.out.print(" ");
				}
				spaces++;
				for(int j=1;j<=stars;j++)
				{
					System.out.print("*"+" ");
				}
				stars--;
				
			}
			
			System.out.println();
		}


	}

}
