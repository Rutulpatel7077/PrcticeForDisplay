
package f16s3oct6;

/**
 *
 * @author JWright
 */
public class TestExperiments {
    public static void main(String[] args)
    {
        System.out.printf("5*7=%d%n", getProduct(5,7));
        System.out.printf("%d and another %d", getProduct(10,10), getProduct(2,3));
    }
    
    
    public static int getProduct(int x, int y)
    {
        return x * y;
    }
    
    public static int getSum()
    {
        int x;
        int y;
        return x + y;
    }
}
