package pfweek13prep;

public class ExamPrep {
      
    /**
     * The goal of this file to give you an opportunity to work through similar exercises
     * to what we have looked at during the semester.
     * 
     * Under each comment, write the code to match the comment.  If you get stuck, look through
     * the code for that week or ask Jaret for support.  This file will really help prep
     * for the exam next week.
     */
    
     public static void main(String[] args)
    {          
        
        /**
         * Week 1 - Question 1 - Write 1 line of code that will print the following string to the screen and 
         * then a new line character: "Hello World - I can't believe that phrase used
         * to seem like complex code :-) "
         */
        System.out.println("********** Question 1 ***********");

        
        /**
         * Week 2 / 3 - Question 2 - Create a variable that can hold your name.  Prompt the user to enter their name
         * and then print to the screen "Hello [person's name].  It will be great 
         * working with you today.".  Where [person's name] is the name entered
         * by the user
         */
        System.out.println("********** Question 2 ***********");

        
        /**
         * Week 2/3 - Question 3 - Ask the user to enter a number between 1-100.  
         * If the number is greater than 80 print "that is a big number". 
         * If the number is greater than 50 and less then 80, print "that is a medium number"
         * otherwise print "that is a small number" to the screen
         */
        System.out.println("********** Question 3 ***********");        
        
        
        /**
         * Week 4 - Question 4 - Creating a class - create a new java class called "student".  Each
         * instance of a student should have a first name, last name, student number and 
         * overall average mark.  Hint:  You will need to build a constructor
         * for your class.  Using the name from Question 2 and the number from Question 3,
         * create a new instance of the Student in the space below.
         */
        System.out.println("********** Question 4 ***********");        
        
        
        /**
         * Week 4 - Question 5 - Using the inherited toString() method for a student, display
         * your student instance to the screen.  Note: You should see the memory location
         * where the student is stored.
         */
        System.out.println("********** Question 5 ***********");        
        
        
        /**
         * Week 4 - Question 6 - Create a method called "modifiedToString" for the student class.  The 
         * toString method should return the first and last name of the student separated
         * by a space.  Test your method by using the instance of your student and call
         * the toString() method you created.
         */
        System.out.println("********** Question 6 ***********");        
                
        
        /**
         * Week 4 / 5 - Question 7 - create another instance of a student. Compare the average mark of each student
         * and write "The top student is: [student name]" for which ever student has the higher grade.
         */
        System.out.println("********** Question 7 ***********");   
        
        
        /**
         * Week 5 - Question 8  - Create a do...while loop that displays your name 4 times on the same line.  
         * Your name should be separated by comma's except the last time your name is printed
         */
        System.out.println("********** Question 8 ***********");   
        
        
        /**
         * Week 5 - Question 9 - Write a loop that displays the numbers 1 - 100 on the screen
         */
        System.out.println("********** Question 9 ***********");

        
        /**
         * Week 5 - Question 10 - Write a loop that displays the numbers 1-100 on the screen (1 # on each line).  If the
         * number is divisible by 3, write Java.  If it is divisible by 5 write "rocks".  If it is divisible by 3 and 5,
         * write Java Rocks
         * 
         * For example:
         * 1
         * 2
         * 3 Java
         * 4
         * 5 Rocks
         * 6 Java
         * 7
         * 8 
         * 9 Java
         * 10 Rocks
         * 11 
         * 12 Java
         * 13
         * 14
         * 15 Java Rocks
         */
        System.out.println("********** Question 10 ***********");
        

        /**
         * Week 9 - Question 11 - Write the names of your 5 closest friends into an Array, then run a loop to display 
         * the contents of the array to the screen
         */
        System.out.println("********** Question 11 ***********");
        
        
        /**
         * Week 11 - Question 12 - Create an ArrayList of Student objects (from questions 4-7) and add in 3 students.
         * Display all the Students to the screen by looping over the ArrayList using an enhanced for loop
         */
        System.out.println("********** Question 12 ***********");
                
        
        /** 
         * Week 11 - Question 13 - Using the ArrayList created in the previous exercise, create a method
         * called highest mark that will read through the ArrayList and return the 
         * student object with the highest mark.  Display the student's name on the screen.
         */
        System.out.println("********** Question 13 ***********");        
        
        
        /**
         * Week 10-12 - Question 14 - Write a method that will accept a String and return it in reverse order.  
         * Using the response from the method, display the results to the screen.
         * 
         * For example: System.out.printf("'Beaker' in reverse is %s%n", wordReversed("Beaker"));
         * would result in
         * 'Beaker' in reverse is rekaeB
         */
        System.out.println("********** Question 14 ***********");

        
        /**
         * Weeks 10-12 - Question 15 - Create a method called "vowels" that will return the vowels from a String as a String.  For example, if
         * you ran the line of code System.out.print("The vowels in the word pineapple are: %s%n", getVowels("Pineapple"));
         * it would return: 
         * The vowels in the word pineapple are: IEAE
         */
        System.out.println("********** Question 15 ***********");
        //System.out.printf("The vowels in the word pineapple are: %s%n", getVowels("Pineapple"));
        
        
        /**
         * Weeks 10-12 - Question 16 Create a method that can validate when a user enter a number as a month (i.e. 1=Jan, 2=Feb, 3-Mar, etc...)
         * If it is not a valid month number (1-12), the method should throw an IllegalArgumentException.  If it is a valid
         * month, it should return true.
         * 
         * Test both a valid and invalid month below.  Structure your code so that the code immediately under this comment 
         * can handle when the exception is thrown.  When the exception is thrown, it should gracefully display the error 
         * message, the program should keep running
         */
        System.out.println("********** Question 16 ***********");

        
        
        /**
         * Weeks 10-12 - Question 17 Create code that will display the contents of this array as a 2 dimensional table.  Note: the columns should
         * all line up and none of the numbers should touch between columns
         */
        System.out.println("********** Question 17 ***********");
        int[][] table = new int[10][15];
        for (int row = 0; row < table.length; row++)
        {
            for (int col = 0; col < table[row].length; col++)
            {
                table[row][col] = (row+1) * (col+1);
            }
        }
                
        
        /**
         * Weeks 5 - Question 18 Create a method called "rollTheDice()" that will simulate rolling a 
         * 6 sided die.  The method should return a random number between 1-6
         * Test your method with 6 rolls below - do you get random numbers between 1-6?
         */
        System.out.println("********** Question 18 ***********");
        
        
        /**
         * Weeks 5 & 9/10 - Question 19 - Using the "rollTheDice()" method from the previous method, simulate rolling 2 dice 
         * 1,000,000 times.  Track the sum of the dice after each roll in an Array.  At the end, display how many
         * times the dice "rolled" a 2, how many times it rolled a 3, etc... an example output is below.
         * 
         * After rolling the dice 1,000,000 times, here is the distribution of sums:
         *  2  27747 
         *  3  55725 
         *  4  83141 
         *  5 111291 
         *  6 138302 
         *  7 166919 
         *  8 138739 
         *  9 110928 
         * 10  83752 
         * 11  55731 
         * 12  27725 
         * 
         */
        System.out.println("********** Question 19 ***********");
        
        
        
        
        /**
         * Week 12 - Question 20 - In the space below, create some code that write your name and a quick description 
         * of your favourite project this semester to a file.
         */
        System.out.println("********** Question 20 ***********");
        
        
        
        /**
         * Week 12 - Question 21 - In the space below, read from the file created in question 20
         * and display each line to a new line on the screen
         */
        System.out.println("********** Question 21 ***********");
                
        
        
        /**
         * For the following questions, uncomment the code and fix the errors
         */
        
        /**
         * Fix the problem in the following code
         */        
        //System.out.print("Yehaw!")
                

        /**
         * Fix the problem in the following code
         */
        //int touchdown = 7;
        //System.out.printf("The value of a touchdown is %d%n", tochdown);
        
        
        /**
         * Fix the problem in the following code
         */
        //String name = "Adom Baum";
        //System.out.printf("The value of a touchdown is %d%n", name);
                
        
    }

        /**
         * Fix the problem in the following code
         */
         //System.out.println("I'm a error without a method...hint hint :-) ");
         
     
    /**
     * Put the reverse method here
     */

     
    /**
     * Put the method for validating the month here
     */
            

    
    /**
     * Put the getVowels method here.
     */

     
    /**
     * Put the rollTheDice() method here
     */
    
    
    
} // end of the class
