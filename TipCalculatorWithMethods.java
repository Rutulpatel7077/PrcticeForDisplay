
package sept22f16;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class TipCalculatorWithMethods {
    static String hiya = "Hello, how are you?";
    
    public static void main(String[] args)
    {
        double mealCost = getMealCost();
        double tipPercent = getTipPercentage();
        double tipAmount = getTipAmount(mealCost, tipPercent);
        System.out.printf("Your meal was $%.2f, with a %.0f%% tip, your tip "
                + "should be $%.2f%n", mealCost, tipPercent, tipAmount);
        
        System.out.printf("A $100 meal with a 19%% tip should be $%.2f%n",
                getTipAmount(100, 19));
    }
    
    public static double getTipAmount(double mealAmount, double tipP)
    {
        tipP = tipP/100;
        return mealAmount * tipP;
    }
    
    public static double getMealCost()
    {
        System.out.print("What was the cost of your meal?");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }
    
    public static double getTipPercentage()
    {
        System.out.println(hiya);
        System.out.printf("Please enter the tip percentage: ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }
}
