
public class Pattern5InvertedMirroredRightAngleTriangle {

	public static void main(String[] args) {
	
	   final int  rows =5; 
	   int spaces= 1;
	   int star=5;
for(int i =1; i<=rows;i++)
{
	/* 1st row =0 times spaces will be printed
	 * 2nd row =1 times spaces will be printed
	 * 3rd row= 2 times spaces will be printed
	 * 4th row= 3 times spaces will be printed
	 * 5th row= 4 times spaces will be printed
	 */
	
	for(int j=1;j<spaces;j++)// 
	{
		System.out.print(" ");
	}
	spaces++;
	
	
	for(int k=star;k>0;k--)
	
	{
		System.out.print("*");
	}
	star--;
	
	System.out.println("");
}
		
		
	}

}
