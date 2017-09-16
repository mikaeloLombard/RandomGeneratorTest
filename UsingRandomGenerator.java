
package introducingobjects;

import java.util.Random;

public class UsingRandomGenerator 
{

   
    public static void main(String[] args) 
    {
      Random generator = new Random(); // <== change value in (). Best random is empty.
      int i = generator.nextInt(10);
      System.out.println(i);
      i = generator.nextInt(10);
      System.out.println(i);
      i = generator.nextInt(10);
      System.out.println(i);
      
    }
    
}
