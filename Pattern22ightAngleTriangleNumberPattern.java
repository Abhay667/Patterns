
public class Pattern22ightAngleTriangleNumberPattern {

	public static void main(String[] args) {
  final int rows=5;
  int count=1;
  int stars=1;
  for(int i=1;i<=rows;i++)
  {
	  for(int j=1;j<=stars;j++)
	  {
		  System.out.print(count+" ");
		  count++;
	  }
	  count=1;
	  stars++;
	  System.out.println();
  }

	}

}
