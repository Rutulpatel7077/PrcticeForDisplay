
package f16s3nov10;

import java.security.SecureRandom;

/**
 *
 * @author jwright
 */
public class Question8WithArrays {
    public static void main(String[] args)
    {
        //declare an array of integers to store the count
        int[] countOfRandomNumbers = {0,0,0,0,0,0,0,0,0,0};
        
        SecureRandom rng = new SecureRandom();
        
        //this will create 1000 random numbers and store the counts
        for (int i=1; i<=1000;  i++)
        {
            int randomNum = rng.nextInt(10);
            countOfRandomNumbers[randomNum]++;
            displayIntArray(countOfRandomNumbers);
        }
        
       
    }
    
    /** 
     * This method will display an array of integers
     */
    public static void displayIntArray(int[] arrayToDisplay)
    {
        //this will loop over the array and display the results
        for (int i=0; i < arrayToDisplay.length; i++)
        {
            System.out.printf("%2d: %4d%n", i+1, arrayToDisplay[i]);
        }   
        System.out.println("------------------");
    }
     
}
