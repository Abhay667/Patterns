
public class Pattern4MirroredRightAngleTriangle {

	public static void main(String[] args) {
		int spaces=5;
int rows =5;
int count =1;
for(int i =1;i<=rows;i++)
{
	
	for(int j=1;j<=spaces-1;j++)  // j=1,2,3,4
	{
		System.out.print(" ");
		
	}
	spaces--;
	for(int j=1;j<=count;j++)// j=1,count=1,,,count=2,j=1,2
	{
		System.out.print("*");
	}
	
	count++;
	System.out.println("");
}
	
	
	
	}

}
