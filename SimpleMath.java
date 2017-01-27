
package sept15;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class SimpleMath {
    public static void main(String[] args)
    {
        double num1, num2; //this declares 2 variables to store integers
        
        System.out.print("Please enter the first number: ");
        
        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt();
        
        System.out.print("Please enter the second number: ");
        num2 = keyboard.nextInt();
        
        System.out.printf("%.0f + %.0f = %.0f %n", num1, num2, num1+num2);
        System.out.printf("%.0f - %.0f = %.0f %n", num1, num2, num1-num2);
        System.out.printf("%.0f * %.0f = %.0f %n", num1, num2, num1*num2);
        System.out.printf("%.2f / %.2f = %.2f %n", num1, num2, num1/num2);
        System.out.printf("%.2f %% %.2f = %.2f %n", num1, num2, num1%num2);
        
    }
}
