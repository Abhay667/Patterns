
public class Pattern7PyramidStarPatternProgram {

	public static void main(String[] args) {
		
		
//		   * 
//		  * * 
//		 * * *
		
final int rows=3;
int spaces=2;
int stars=1;
for(int i=1;i<=rows;i++)
{
	
	/* 1st row 2 spaces are required 
	 * 2nd row 1 space is required
	 * 3rd row no space is required
	 * */
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
	System.out.println();
}
		

	}

}
