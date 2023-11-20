
public class Pattern21HalfDiamondStarPattern {

	public static void main(String[] args) {
	int c1=1;
	int c2=2;
		for(int i=1;i<=5;i++ )
		{
			
			for(int j=1;j<=3;j++)
			{
				
				if((j==1 && i==c1)||(j==2&&i==c2)||j==3&&i==3 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			
			//System.out.print( c1);
			//System.out.print(c1);
			System.out.println();
			if(i==c1)
			{
				c1=c1+2;
			}
			if(c2==i)
			{
				c2=c2+2;
			}
		}
		
		

	}

}
