/* 
 * by Shane A. Delos Reyes
 * date: 2022.10.03
 * about: Practicing class and objects. PG 175 #.
 * 
 */
import java.util.Scanner;                                                                                                                                                                                                                                                                                                                                                                                                                       
public class PaintWallArea {
    public static void main(String[] args){
        final float AREA_PER_GALLON = 350;
        final float PRICE_PER_GALLON = 32;
        Scanner read = new Scanner(System.in);
        String customerName;
        float length, width, height, calculatedTotalPrice;
        //Prompt for inputs
        System.out.print("Name: ");
        customerName = read.nextLine();
        System.out.print("Enter the length of the room: ");
        length = read.nextFloat();
        System.out.print("Enter the width of the room: ");
        width = read.nextFloat();
        System.out.print("Enter the height of the room: ");
        height = read.nextFloat();

        System.out.print("Hello "+customerName+", \n");

        calculatedTotalPrice = getTotalPrice(length, width, height, AREA_PER_GALLON, PRICE_PER_GALLON);

        System.out.printf("Your total price is: $%.2f", calculatedTotalPrice);

    }

    public static float getTotalPrice(float length, float width, float height, 
    float AREA_PER_GALLON, float PRICE_PER_GALLON){
        float wallArea, gallonsNeeded, totalPrice;

        wallArea = 2*((length+width) * height);
        System.out.printf("Wall area: %.2f\n", wallArea);
        gallonsNeeded = gallonsOfPaintNeed(wallArea, AREA_PER_GALLON);
        System.out.printf("Gallons needed: %.2f\n", gallonsNeeded);
        System.out.println("Price per gallon: $"+PRICE_PER_GALLON);

        totalPrice = gallonsNeeded*PRICE_PER_GALLON;

        return totalPrice;
    }

    public static float gallonsOfPaintNeed(float wallArea, float AREA_PER_GALLON){
        float totalGallons;

        totalGallons = wallArea/AREA_PER_GALLON;

        return totalGallons;
    }
}
