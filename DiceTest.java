package f16s3dec1;

import java.util.MissingFormatArgumentException;

/**
 *
 * @author jwright
 */
public class DiceTest {
    public static void main(String[] args)
    {
        Dice die1 = new Dice(6); //valid dice object
        try
        {
            Dice die2 = new Dice(2); //invalid dice object
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        
        System.out.printf("The face value of die1 initially is : %d%n", die1.getTheFaceValue());
        die1.rollTheDice();
        
        System.out.printf("The face value of die1 after rolling it is : %d%n", die1.getTheFaceValue());
        
        try
        {
            System.out.printf("This should throw an exception %d");
        }
        catch (MissingFormatArgumentException e)
        {
            System.out.printf("The error message is %s%n", e.getMessage() );
        }
        
        String[] myFriends = {"Dave","Jimbo","Freddie","Grace"};
        for (int i=0; i < myFriends.length; i++)
        {
            System.out.println(myFriends[i]);
        }
        
        
        
        
    }
}
