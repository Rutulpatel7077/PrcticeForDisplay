package sept22f16;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class GoFetch 
{
    //This is the method header
    public static void main(String[] args)
    {
        System.out.print("Hi, what is your name? ");
        
        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.nextLine();
        
        System.out.printf("Hello %s, it's nice to work with you%n", userName);
        
        //This will call the method fetchHeadline() and return a String
        //with the headline in it
        String headline = fetchHeadline();
        
        //Print the results
        System.out.printf("Today's headline is %s%n", headline);
        
        System.out.printf("Another head is " + fetchHeadline());
    }
    
    /**
     * This method will prompt the user for a headline and return it
     * to the calling function
     */
    public static String fetchHeadline()
    {
        System.out.printf("%n%nEnter today's headline: ");
        Scanner keyboard = new Scanner(System.in);
        
        String headline = keyboard.nextLine();
        return headline;
    }   
}
