
public class Pattern3ArrowShapedPattern {

	public static void main(String[] args) {
//	
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

		
int n=9;
int l=n-5;//int l=4;
		for(int i=1;i<=n;i++)// for number of rows
		{
			 if(i<=5)
			 {
			for(int j=1;j<=i;j++)
			 {
				System.out.print("*");
			 }
			}
			
			 else //if(i>5)
			{
				for(int k1=1;k1<=l;k1++)
				{
					System.out.print("*");
				}
				l--;
			}
				
			
			System.out.println(); // new line 
			
			
		}
	}

}
