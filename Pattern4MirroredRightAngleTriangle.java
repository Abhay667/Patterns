
public class Pattern4MirroredRightAngleTriangle {

	public static void main(String[] args) {
int spaces=5;
int rows =5;
int count =1;
for(int i =1;i<=rows;i++)
{
	
	for(int j=1;j<=spaces-1;j++)  
	{
		System.out.print(" ");
		
	}
	spaces--;
	for(int j=1;j<=count;j++)
	{
		System.out.print("*");
	}
	
	count++;
	System.out.println("");
}
	
	
	
	}

}
