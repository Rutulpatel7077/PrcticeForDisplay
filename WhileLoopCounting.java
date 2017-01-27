
package f16s3oct13;

/**
 *
 * @author jwright
 */
public class WhileLoopCounting {
    public static void main(String[] args)
    {
        int count = 1;
        
        while (count <= 100)
        {
            System.out.println(count);
            count++;
        }
        
        //create a loop that will count from 100 to 1
        while (count >= 1)
        {
            System.out.println(count);
            count--;
        }
        
        
        //create a loop that will count from 49 to 0 going in steps of 7
        count = 49;
        while (count >=0)
        {
            System.out.println(count);
            count = count - 7;
        }
    }
}
