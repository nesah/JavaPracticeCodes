/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220913
 * 
 * 
 * About: Write a class that prompts a user for the number of eggs in the order and then display
 * the amount owed with a full explanation. For example, typical output might be, “You
 * ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each
 * for a total of $7.85.”
 * 
 */
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        final float DOZEN = 3.25f;
        final float INDIVIDUAL = 0.45f;
        int orderedEggs, orderedDozen, orderedLoose;
        float total;

        System.out.print("\nHow many eggs?  ");
        orderedEggs = read.nextInt();

        //computations
        orderedDozen = orderedEggs / 12;
        orderedLoose = orderedEggs % 12;
        total = (orderedDozen * DOZEN) + (orderedLoose * INDIVIDUAL);

        System.out.print("You ordered " + orderedDozen + " dozen for $3.25 each ");
        System.out.print("and " + orderedLoose + " loose for $0.45 each.\n");
        System.out.printf("You have a total of $%.2f\n", total);
    }
}
