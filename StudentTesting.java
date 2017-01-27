
package f16sept29;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class StudentTesting {
    public static void main(String[] args)
    {
        Student kevin = new Student("Kevin", "Mitchell", "km@corporate.com", 
                   "COPA", 100000234, LocalDate.of(1987,01,01) );
        
        System.out.printf("Our first student is: %s%n", kevin.toString());
        
         Student mansi = new Student("Mansi", "Patel", "mansi@travellor.com", 
                   "COPA", 100000235, LocalDate.of(1988,10,22) );
         
         System.out.printf("Our second student is: %s%n", mansi.toString());
         
         System.out.printf("%s is %d years old%n", kevin.toString(), kevin.getAge());
         System.out.printf("%s is %d years old%n", mansi.toString(), mansi.getAge());
         
         //double avg = getAverageAge(kevin, mansi);
    }
    
    
}
