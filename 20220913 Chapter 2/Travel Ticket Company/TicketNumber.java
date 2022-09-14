/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220913
 * 
 * 
 * About: The class prompts a ticket agent to enter a six-digit ticket number. 
 * Ticket numbers are designed so that if you drop the last digit of the number, 
 * then dividethe number by 7, the remainder of the division will be 
 * identical to the last dropped digit.
 * 
 */
import java.util.Scanner;
public class TicketNumber {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        try{
        int ticketNumber;
        int droppedEndNumber, lastNumber, ticketRemainder;
        boolean isValidTicket;

        System.out.print("Enter Ticket Number:    ");
        ticketNumber = read.nextInt();

        //computations
        droppedEndNumber = (int)(ticketNumber * 0.1);
        lastNumber = ticketNumber - (droppedEndNumber * 10);   
        ticketRemainder = droppedEndNumber % 7;
        isValidTicket = (ticketRemainder == lastNumber);
        System.out.println("Ticket Validity: "+ isValidTicket);
        }

        finally{
            read.close();
        }

    }
}
