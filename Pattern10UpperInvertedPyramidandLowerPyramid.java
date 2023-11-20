public class Pattern10UpperInvertedPyramidandLowerPyramid {
    
    
    public static void main(String[] args) {
        
        final int rows=5;
        int spaces=0;
        int stars=3;
        
        
        for(int i=1;i<=rows;i++)
        {
            if (i<=3)
            {
                for(int j=1;j<=spaces;j++)
                {
                    System.out.print(" ");
                }
                
                spaces=spaces+2;
                
                for(int j=1;j<=stars;j++)
                {
                    System.out.print("*"+"   ");
                    
                }
                stars--;
                
            }
            if(i>3)
            {
                spaces=spaces-4;
                
                for(int j=1;j<=spaces;j++)
                
                {
                    System.out.print(" ");
                    
                    
                }
                
                stars++;
                for(int j=0;j<=stars;j++)
                {
                    System.out.print("*"+"   ");
                    
                }
                
                
                
                
                
            }
            System.out.println();
        }
        
        
    }
}