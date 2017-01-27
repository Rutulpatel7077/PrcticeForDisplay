
package f16sept29;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class Student {
    private String firstName, lastName, emailAddress, major;
    private int studentNum;
    private LocalDate dateOfBirth;
    
    public Student(String fName, String lName, String email, 
                   String major, int studNum, LocalDate dateOfBirth)
    {
        firstName = fName;
        lastName = lName;
        emailAddress = email;
        this.major = major;
        studentNum = studNum;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    public int getAge()
    {
        int age = LocalDate.now().getYear() - dateOfBirth.getYear();
        return age;
    }
    
    
}
