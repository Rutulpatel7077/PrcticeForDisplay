package f16s3oct6;

import java.security.SecureRandom;

/**
 *
 * @author JWright
 */
public class Dice {
    private int numOfSides, faceValue;  //instance variables
    
    public Dice(int numberOfSides)
    {
        setNumOfSides(numberOfSides);
        rollDice(); //give the dice a quick roll to set the initial value
    }
    
    /**
     * This method will use a random number generator to set the face value
     * of the Dice object
     */
    public void rollDice()
    {        
        SecureRandom rng = new SecureRandom();
        faceValue = rng.nextInt(numOfSides) + 1;
    }
    
    /**
     * This method accepts the number of sides as an argument
     * and sets the instance variable. 
     */
    public void setNumOfSides(int numberOfSides)
    {
        if (numberOfSides < 4 || numberOfSides > 12)
            throw new IllegalArgumentException("Dice must have 4-12 sides");
        else
            this.numOfSides = numberOfSides;
    }
    
    /**
     * This method returns the face value of the Dice object as an integer
     */
    public int getFaceValue()
    {
        return faceValue;
    }
}
