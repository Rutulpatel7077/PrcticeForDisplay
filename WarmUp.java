/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f16s3oct6;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WarmUp {
    
    public static void main(String[] args){
        System.out.printf("What is your name?: ");
        Scanner keyboard = new Scanner(System.in);
        String  userName = keyboard.nextLine();
        
        System.out.printf("Please enter the year you were born: ");
        int yearBorn = keyboard.nextInt();
        
        System.out.printf("%s, you are %d years old",userName,
                                                getAge(yearBorn));
    }  //end of main method
    
    
    public static int getAge(int yearBorn)
    {
        return 2016-yearBorn;
    }
}
