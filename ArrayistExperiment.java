
package f16s3nov24;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class ArrayistExperiment {
    public static void main(String[] args)
    {
        int[] grades = new int[5];
        grades[0] = 87;
        grades[1] = 99;
        System.out.printf("The average grade of the array is %.1f %n", 
                                                getArrayAverage(grades));
        System.out.printf("The array toString method gives us: %s%n", grades.toString());
        
        //Let's build an ArrayList and see if it works better for us
        ArrayList<Integer> gradesAL = new ArrayList<>();
        gradesAL.add(87);
        gradesAL.add(99);
        System.out.printf("The ArrayList toString method gives us: %s%n", 
                                                                gradesAL.toString());
        System.out.printf("The average in the ArrayList is %.1f%% %n",
                                                                getAverageAL(gradesAL));
        gradesAL.add(100);
        System.out.printf("The average in the ArrayList is %.1f%% %n",
                                                                getAverageAL(gradesAL));
        System.out.printf("The student has at least 1 grade of 100, that is a %b statement",
                            gradesAL.contains(100));
        System.out.print("Enter another grade: ");
        Scanner keyboard = new Scanner(System.in);
        gradesAL.add(keyboard.nextInt());
       
        System.out.printf("The ArrayList is %s%n", gradesAL.toString());
        gradesAL.remove(0);
        System.out.printf("The ArrayList after removing position 0 is %s%n", gradesAL.toString());
        
       
        
    } //end of the main method
    
    /**
     * This method will accept an ArrayList as an argument and return a double
     * with the average inside of the ArrayList
     */
    public static double getAverageAL(ArrayList<Integer> arrayList)
    {
        int sum = 0;
        /*for (int i = 0; i < arrayList.size() ; i++)
        {
            sum += arrayList.get(i);
        }*/
        
        //with an enhanced for loop
        for (int grade : arrayList)
        {
            sum += grade;
        }
        
        return (double) sum/arrayList.size();
    }
    
    
    
    /**
     * This method will return the average of the array as a double
     */
    public static double getArrayAverage(int[] intArray)
    {
        int sum=0;
        for (int i = 0; i < intArray.length ; i++)
        {
            sum += intArray[i];
        }
        return (double) sum/intArray.length;
    }   //end of getArrayAverage method
    
}   //end of the class
