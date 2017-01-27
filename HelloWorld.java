package helloworld;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.printf("Hello World");               
        
        System.out.printf("%nWhat is your name?:  ");
        
        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.nextLine();
        
        System.out.printf("%nHello " + userName);
        
    }
    
}
