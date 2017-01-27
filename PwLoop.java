
package f16s3oct6;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class PwLoop {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String password;
        do
        {
            System.out.print("Enter a password: ");
            password = keyboard.nextLine();
        } while (invalidPassword(password));
        
        System.out.printf("Success");
    }   //end of main method
    
    public static boolean invalidPassword(String pw)
    {
        if (pw.equals("Sw0rdF1sh"))
            return false;
        else
        {
            System.out.printf("Sorry, that password is invalid%n");
            return true;
        }
    }
}
