package f16s3nov10;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class Test2TakeUp {
    
    public static void main(String[] args)
    {
        /**
         * Question 1 - display your name and student number to the screen
         * 1 Mark
         */
        System.out.println("Question 1");
        
        
        /**
         * Question 2 - Create a for loop that will display the numbers 100 to 120 on
         * the screen, going up by 1 each time
         * 2 Marks
         */
        System.out.println("Question 2");
        for(int counter = 100; counter <= 120; counter++)
        {
            System.out.println(counter);
        }
        
        
        /**
         * Question 3 - Create a while loop that will display the numbers 120 to 100 on 
         * the screen, going down by 2 each time
         * 2 Marks
         */
        System.out.println("Question 3");
        int counter = 120;
        while (counter >= 100)
        {
            System.out.println(counter);
            counter = counter - 2;
        }
        
        /**
         * Question 4 - Have the computer generate a random number between 1 and 100, then display it 
         * to the screen
         * 2 Marks
         */
        System.out.println("Question 4");
        SecureRandom rng = new SecureRandom();
        System.out.println(rng.nextInt(100)+1);
        
        
        /**
         * Question 5 - Prompt the user to enter the name of their favourite course and store the information in a 
         * variable
         * 2 Marks
         */
        System.out.println("Question 5");
        String course;
        System.out.print("Enter the name of your favourite course: ");
        Scanner keyboard = new Scanner(System.in);
        course = keyboard.nextLine();
        
        /**
         * Question 6 - Prompt the user to enter their grade in their favourite course.  Then display to the screen
         * "Your favourite course is [their favourite course] and you have a mark of [what their mark is]"
         * 2 Marks
         */
        System.out.println("Question 6");
        System.out.print("Enter the grade you earned in that course: ");
        int grade = keyboard.nextInt();
        System.out.printf("Your favourite course is %s and you have a mark of %d%n",
                                        course, grade);
        
        /**
         * Question 7 - Create a method called sum that will receive 2 integers as arguments and return their sum. 
         * In the space below, test your method and display the result to the screen.
         * Note: be sure to place the sum method outside of the main method.
         * 3 Marks
         */
        System.out.println("Question 7");
        System.out.printf("The sum of 10 and 34 is %d%n", sum(10,34));
        
        /**
         * Question 8 - Create a loop that will generate 1000 random numbers between the range of 1-10.
         * Track how many times each number is generated and at the end, display the results in a table.
         * The columns should line up.
         * 
         * An example output is
         *   1:  116
         *   2:  112
         *   3:   86
         *   4:   98
         *   5:   85
         *   6:  110
         *   7:  101
         *   8:  100
         *   9:   84
         *  10:  108
         * 
         * Marks 5
         */
        System.out.println("Question 8");
        int num1 = 0; 
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
        int num10 = 0;
        for (int i=1; i <= 1000; i++)
        {
            int currentNum = rng.nextInt(10)+1;
            if (currentNum == 1)
                num1++;
            else if (currentNum ==2)
                num2++;
            else if (currentNum ==3)
                num3++;
            else if (currentNum ==4)
                num4++;
            else if (currentNum ==5)
                num5++;
            else if (currentNum ==6)
                num6++;
            else if (currentNum ==7)
                num7++;
            else if (currentNum ==8)
                num8++;
            else if (currentNum ==9)
                num9++;
            else if (currentNum ==10)
                num10++;
        }
        System.out.printf("%2d: %4d%n", 1, num1);
        System.out.printf("%2d: %4d%n", 2, num2);
        System.out.printf("%2d: %4d%n", 3, num3);
        System.out.printf("%2d: %4d%n", 4, num4);
        System.out.printf("%2d: %4d%n", 5, num5);
        System.out.printf("%2d: %4d%n", 6, num6);
        System.out.printf("%2d: %4d%n", 7, num7);
        System.out.printf("%2d: %4d%n", 8, num8);
        System.out.printf("%2d: %4d%n", 9, num9);
        System.out.printf("%2d: %4d%n", 10, num10);
                
        
        
        /**
         * Question 9 - Create a method called "speedEvaluator" that will receive the speed of a vehicle
         * as an argument.   
         * 
         * If the speed is 50 kph or less, the method should return "city driving"
         * If the speed is 51-90 kph, the method should return "rural driving"
         * If the speed is 90-125 kph, the method should return "highway driving"
         * If the speed is greater than 125, the method should return "speeding"
         * 
         * To test your method, remove the comments from the following lines of code.
         * Marks 5
         */
        System.out.println("Question 9");
        System.out.printf("42 kph means the person is doing %s%n", speedEvaluator(42));
        System.out.printf("50 kph means the person is doing %s%n", speedEvaluator(50));
        System.out.printf("90 kph means the person is doing %s%n", speedEvaluator(90));
        System.out.printf("91 kph means the person is doing %s%n", speedEvaluator(91));
        System.out.printf("115 kph means the person is doing %s%n", speedEvaluator(115));
        System.out.printf("125 kph means the person is doing %s%n", speedEvaluator(125));
        System.out.printf("126 kph means the person is doing %s%n", speedEvaluator(126));
        
        
        
    }   //end of the main method
    
    
    /**
     * Question 7 - the sum method goes under here.
     */
     public static int sum(int num1, int num2)
        {
            return num1+num2;
        }
    
    
    
    /**
     * Question 9 - the speedEvaluator method goes under here.
     *  * If the speed is 50 kph or less, the method should return "city driving"
         * If the speed is 51-90 kph, the method should return "rural driving"
         * If the speed is 90-125 kph, the method should return "highway driving"
         * If the speed is greater than 125, the method should return "speeding"
     */
     public static String speedEvaluator(int speed)
     {
         if (speed <=50)
             return "city driving";
         
         if (speed >= 51 && speed <= 90)
             return "rural driving";
         
         if (speed > 90 && speed <= 125)
             return "highway driving";
         
         return "speeding";
     }
}
