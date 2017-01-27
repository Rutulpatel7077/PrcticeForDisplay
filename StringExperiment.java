package f16s3nov24;

/**
 *
 * @author jwright
 */
public class StringExperiment {
    public static void main(String[] args)
    {
        String myName = "Jaret";
        System.out.printf("My name has %d characters.%n", myName.length());
        System.out.printf("My first initial is %c%n", myName.charAt(0));
        
        //Create a variable to hold your last name
        //Using your first name and last name, print your initials to the screen
        String lastName = "Wright";
        System.out.printf("%c.%c. %n",myName.charAt(0),lastName.charAt(0) );
        
        //using a for loop display all the letters of your first name, but
        //only put 1 letter on each line
        for (int i=0; i < myName.length(); i++)
        {
            System.out.println(myName.charAt(i));
        }
        
        //put your name in a 2 dimensional array so that it displays on a diagonal
        //for example "Jaret" would display as
        // J
        //      A
        //          R
        //              E
        //                  T
        char[][] twoDName = new char[myName.length()][myName.length()];
        //twoDName[0][0] = myName.charAt(0);
        //twoDName[1][1] = myName.charAt(1);
        for (int i=0; i < myName.length(); i++)
        {
            twoDName[i][i] = myName.charAt(i);
        }
        
        //now we need to display the 2d Array      
        for (int row = 0; row < twoDName.length; row++)
        {
            for (int col = 0; col < twoDName[row].length; col++)
            {
                if (twoDName[row][col] != '\u0000')
                    System.out.print(twoDName[row][col]);
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
       
        String email = "JDub@GC.org";
        System.out.printf("The string %s contains '@GC' is a %b statement%n",
                                            email, email.contains("@GC"));
         System.out.printf("The string %s contains 'break time' is a %b statement%n",
                                            email, email.contains("break time"));
        System.out.print("Ja" + "ret" + "\n");
        System.out.printf("%s%n", myName.concat(lastName));
        
        System.out.printf("The position of the letter '@' in %s is %d%n",
                                   email, email.indexOf("@"));
        
        System.out.printf("Here is the org info from the email address: %s%n",
                                    email.substring(email.indexOf("@")));
        System.out.printf("%s position 2-4 are: %s%n", email, email.substring(2, 4));
        
        System.out.printf("%s ends with .org is %b%n", email, email.endsWith(".org"));
        System.out.printf("%s ends with .com is %b%n", email, email.endsWith(".com"));
        System.out.printf("My name in UPPER case is %s%n", myName.toUpperCase());
        System.out.printf("My name in lower case is %s%n", myName.toLowerCase());
        
        String wordWithWhiteSpace = " fox ";
        System.out.printf("'%s' after it is trimmed is '%s'%n", wordWithWhiteSpace,
                            wordWithWhiteSpace.trim());
    }
}
