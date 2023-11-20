

public class Pattern16InvertedStarPyramid {
    
    public static void main(String[] args) {
        int spaces=0;
        int star=3;
        int rows=3;
        for(int i=1;i<=rows;i++)      
        {
            
            for(int j=0;j<spaces;j++)  
            {
                System.out.print(" ");
                
                
            }
            spaces=spaces+2;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*"+" " + " ");
                
            }
            star--;
            System.out.println();
            
            
        }
        
        
        
        
        
    }
    
}