/* 
 * by: Shane A. Delos Reyes
 * date: 2022.09.15
 * about:  Write a program that prompts the user for the 
 * number of minutes he rented a piece of sports equipment. 
 * Compute the rental cost as $40 per hour plus $1 per additional minute.
 * Display Sammy’s motto with the border that you created in 
 * the SammysMotto2 class in Chapter 1. 
 * Then display the hours, minutes, and total price.
 * 
 */
import java.util.Scanner;
public class SammysSupplies {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        final int RATE_PER_HOUR = 40;
        final int ADDITIONAL_MINUTE = 1;
        int rentedMinutes, computedHour, computedMinutes;
        int hoursPrice, minutesPrice, totalPrice;

        System.out.print("\nRented Minutes:   ");
        rentedMinutes = read.nextInt();

        computedHour = rentedMinutes / 60;                      //computing price of hours
        hoursPrice = computedHour * RATE_PER_HOUR;
        computedMinutes = rentedMinutes % 60;                   //computing price of minutes
        minutesPrice = computedMinutes * ADDITIONAL_MINUTE;
        totalPrice = hoursPrice + minutesPrice;

        System.out.println();
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ss                                  Ss");
        System.out.println("Ss  Sammy's makes it fun in the sun Ss");
        System.out.println("Ss                                  Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.print("You rented:\n"+ computedHour +" hours \n"+
            computedMinutes +" minutes \n");
        System.out.println("Total price: $"+ totalPrice);
    }
}
