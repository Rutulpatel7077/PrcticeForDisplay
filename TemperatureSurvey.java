/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sept15;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class TemperatureSurvey {
    public static void main(String[] args)
    {
        System.out.print("What is the temerature outside? ");
        
        Scanner keyboard = new Scanner(System.in);
        int temp = keyboard.nextInt();
        
        System.out.print("\nThe temperature outside is: " + temp);
        
        if ((temp >= 20) && (temp <=30))
            System.out.print("\nIt is nice enough to wear shorts");
        
        if ( temp == 15)
            System.out.print("\nIt's greater sweater weather");
        
        
        
        
    }
}
