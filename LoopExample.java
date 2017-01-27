
package f16s3oct13;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class LoopExample {
    public static void main(String[] args)
    {
        double sales, commission;
        boolean continueDecision = true;
        final double COMMISSION_RATE = 0.1;
        Scanner keyboard = new Scanner(System.in);
        
        while (continueDecision)
        {
            System.out.print("Enter the amount of sales: ");
            sales = keyboard.nextDouble();
            
            commission = sales * COMMISSION_RATE;
            
            System.out.printf("The commission is $%.2f%n", commission);
            
            System.out.printf("Do you want to calculate another? Type \"yes\" "
                    + "or \"no\"");
            
            keyboard.nextLine();    //clear the enter command from the buffer
            String userDecision = keyboard.nextLine();
            
            if (userDecision.equalsIgnoreCase("yes"))
                continueDecision=true;
            else
                continueDecision=false;        
            
            //alternative way of doing the if statement
            continueDecision = userDecision.equalsIgnoreCase("yes");
        }
    }
}
