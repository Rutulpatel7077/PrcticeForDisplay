package f16s3nov10;

/**
 *
 * @author jwright
 */
public class DividingWarmUp {
    public static void main(String[] args)
    {
        System.out.printf("The number 6 is even: %b%n", even(6));
        System.out.printf("The number 7 is even: %b%n", even(7));
    }
    
    /**
     * This method accepts an integer and returns true if it is an even
     * number (i.e. divisible by 2) or false if it is odd
     */
    public static boolean even(int numToAssess)
    {
        return ((numToAssess % 2) == 0);
    }
    
    public static boolean even2(int numToAssess)
    {
        int dividedByTwo = numToAssess/2;
        return (dividedByTwo*2 == numToAssess);
    }
    
    
}
