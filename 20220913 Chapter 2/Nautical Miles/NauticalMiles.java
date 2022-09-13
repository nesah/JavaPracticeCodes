/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220913
 * 
 * 
 * About: Compute and display the value of nautical miles
 * in kilometers and miles
 * 
 */
import java.util.Scanner;
public class NauticalMiles {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        final float KILOMETERS = 1.852F;
        final float MILES = 1.150779F;
        float nauticalMiles, convertedKM, convertedMiles;

        System.out.print("\nInput Nautical Miles: ");
        nauticalMiles = read.nextFloat();

        //computing
        convertedKM = nauticalMiles * KILOMETERS;
        convertedMiles = nauticalMiles * MILES;

        System.out.printf("\n%f Nautical Miles when converted is %.3f KM", nauticalMiles, convertedKM);
        System.out.printf(" and %.3f M.\n\n", convertedMiles);
    }
}
