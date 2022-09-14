/* 
 * by: Shane A. Delos Reyes
 * date: 2022.09.15
 * about: Write a program that prompts the user for the number of 
 * guests attending an event and then computes the total price, 
 * which is $35 per person. Display the company motto with the border 
 * that you created in the CarlysMotto2 class in Chapter 1, 
 * and then display the number of guests, price per guest, and total price.
 */
import java.util.Scanner;
public class CarlysCatering {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        try{
            final int PRICE_PER_HEAD = 35;
            int numberOfGuests, totalPrice;
            boolean isBigEvent;

            System.out.print("\nWelcome to Carly's Catering\n");
            System.out.print("Number of Guests: ");
            numberOfGuests = read.nextInt();

            isBigEvent = (numberOfGuests > 50);
            totalPrice = numberOfGuests * PRICE_PER_HEAD;

            System.out.println("\n************************************************");
            System.out.println("*                                              *");
            System.out.println("* Carly's makes the food that makes it a party *");
            System.out.println("*                                              *");
            System.out.println("************************************************");
            System.out.println("Big Event: "+ isBigEvent);
            System.out.print("Price per head: $"+
                PRICE_PER_HEAD +"\nTotal Price: $"+ totalPrice);            
            
        }

        finally{
            read.close();
        }

    }
}
