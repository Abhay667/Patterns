
public class Pattern18HollowSquarePattern {

	public static void main(String[] args) {
		int rows=5;
		int right=5;
		int left=1;
		for(int i=1;i<=rows;i++)
		{
		 for(int j=1;j<=rows;j++)
		 {
			 
			 if(j==1 ||j==rows||i==1||i==rows||j==right||j==left)
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
