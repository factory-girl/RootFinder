import java.util.Scanner;
import java.lang.RuntimeException;


/**
* A class that contains a recursive static method for calculating square roots of 
* a given number.
*/
public class RootFinder{
	
	/**
	 * Main method tester for RootFinder
	 */
    public static void main (String [] args){
        double num = -1.0;
        Scanner scan = new Scanner (System.in);
        try{
        while(true){
        do {
        System.out.print ("Enter a number greater than zero, or any letter to exit: ");
        num = scan.nextDouble ();
        }
        while (num < 0);
        System.out.println("Sqrt of "+num+": "+squareRoot(num));
        }
        }
        catch (RuntimeException ex){
            System.out.println ("You entered wrong data or chose to quit the program");
    }
    
    }
    /**
     * Calculates approximate square root of x
     *@param x value
     *@return result squareroot approximation
     */
    public static double squareRoot(double x) {
    	double guess = 1;
        return squareRootGuess(x, guess);
    }
    
    /**
     * Static method squareRootGuess()
     * Helper method for the squareRoot() method
     * Given a guess (g) uses it to calculate the
     * square root of the number (x)
     *
     *@param x value
     *@param g Guess of the square root
     *@return result
     *
     */
        public static double squareRootGuess(double x, double g){
            double eps = 0.00000001;
            double guess = g*g;
            if (Math.abs(guess - x)<= eps){
                return g;
            }
            else {
                return squareRootGuess(x, 0.5*(g+x/g));
            }
            
        }         
}