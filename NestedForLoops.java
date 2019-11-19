public class NestedForLoops
{
    public static void main(String[] args)
    {
        int i, j;
        
        for(i = 1; i <= 3; i++)
        {
            System.out.println("i = " + i + " (outer loop)");
            
            for(j = 1; j <= 5; j++)
            {
                System.out.println("\t j = " + j + " (inner loop)"); 
            }
            
        }
        
        System.out.println("\nMake 3 x 7 rectangle with stars:\n");
        int r, c;
        
        for(r = 1; r <= 3; r++)
        {
         
            
            for(c = 1; c <= 7; c++)
            {
                System.out.print("* "); // no line skipping on the inner loop
            }
            
            System.out.println();
            
        }
    }
}
