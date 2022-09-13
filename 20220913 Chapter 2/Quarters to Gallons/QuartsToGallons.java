/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220913
 * 
 * 
 * About: Convert quartes to gallons
 * 
 */
import java.util.Scanner;
public class QuartsToGallons{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        final int QUARTS_IN_GALLONS = 4;
        int quartsInput, gallonsInQuarts, quartsNeeded;

        System.out.print("Input how many quarts needed:  ");
        quartsInput = read.nextInt();

        //computations
        gallonsInQuarts = quartsInput / QUARTS_IN_GALLONS;
        quartsNeeded = quartsInput - (gallonsInQuarts * QUARTS_IN_GALLONS);

        System.out.println("A job that needs " + quartsInput + 
            " quarts requires " + gallonsInQuarts + " gallons and " +
            quartsNeeded + " quarts.");
    }
}