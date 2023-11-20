public class Pattern11RightDiagonalStarPattern {
    
    public static void main(String[] args) {
    
      final int rows=5;
        int spaces=5;
        for(int i=1;i<=rows;i++)
        {
            
            for(int j=1;j<spaces;j++)
            {
                System.out.print("  ");
                
                
            }
            spaces--;
            
            System.out.print("*");
            
            System.out.println();
        }
        
        
        
        
        
        
        
    }
    
    
    
}