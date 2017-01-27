
package f16s3nov17;

/**
 *
 * @author jwright
 */
public class WarmUp {
    public static void main(String[] args)
    {
        /*
            Define an array of String objects and put the names
            of each person in your group within the array.  If you are
            the only one at a group, get the names of the people around you.
        
            Use a for loop to display each of the group member names, one on
            each line.
        */
        String[] groupMembers = {"Don","Daria","Bill","Alex"};
        
        for (int i=0; i<groupMembers.length; i++)
        {
            System.out.println(groupMembers[i]);
        }
        
    }
}
