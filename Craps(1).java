package f16oct20s3;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class Craps {
    
    private enum Status {WON, LOST, CONTINUE};
    
    public static void main(String[] args)
    {
        Status gameStatus;
        
        System.out.print("Please enter your bet: ");
        Scanner keyboard = new Scanner(System.in);
        int bet = keyboard.nextInt();
        
        int sumOfDice = rollTheDice();
        
        final int SNAKE_EYES = 2;
        final int TREY = 3;
        final int SEVEN = 7;
        final int YO_LEVEN = 11;
        final int BOXCARS = 12;
        
        switch (sumOfDice)
        {
            //these are the cases where the roller wins
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            
            //these are the cases where the roller loses
            case SNAKE_EYES:
            case TREY:
            case BOXCARS:
                gameStatus = Status.LOST;
                break;
                
            default:
                gameStatus = Status.CONTINUE;
        }  // end of the switch
        
        int myPoint = sumOfDice;
        
        while (gameStatus == Status.CONTINUE)
        {
            sumOfDice = rollTheDice();
            
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }
        
        if (gameStatus == Status.WON)
            System.out.printf("The player wins $%d", bet);
        else
            System.out.printf("The player loses $%d", bet);
    }
    
    /**
     * This method will simulating rolling 2 x 6 sided dice
     * and return their sum
     */
    public static int rollTheDice()
    {
        SecureRandom rng = new SecureRandom();
        int die1 = rng.nextInt(6)+1;
        int die2 = rng.nextInt(6)+1;
        
        System.out.printf("%d + %d = %d%n", die1, die2, die1+die2);
        
        return die1 + die2;
    }
}
