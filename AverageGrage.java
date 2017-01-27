package sept22f16;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class AverageGrage {
    public static void main(String[] args)
    {
        //Get 5 grades
        double grade1 = getGrade(1);
        double grade2 = getGrade(2);
        double grade3 = getGrade(3);
        double grade4 = getGrade(4);
        double grade5 = getGrade(5);
        
        //call a method to calculate the average of 5 grades
        double avg = getAverage(grade1, grade2, grade3, grade4, grade5);
        
        //display the result
        System.out.printf("The average grade is %.1f%% %n%n", avg);
    }
    
    public static double getAverage(double g1, double g2, double g3, double g4, double g5)
    {
        return (g1+g2+g3+g4+g5)/5;
    }
    
    
    public static double getGrade(int courseNum)
    {
        System.out.printf("Please enter the grade for course %d: ", courseNum);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }
}
