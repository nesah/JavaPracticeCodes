/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.15
 * about: [GUI]The class prompts a ticket agent to enter a six-digit ticket number. 
 * Ticket numbers are designed so that if you drop the last digit of the number, 
 * then dividethe number by 7, the remainder of the division will be 
 * identical to the last dropped digit.
 */
import javax.swing.*;
public class TicketNumberGUI{
    public static void main(String[] args){
        String ticketNumber;
        int intTicketNumber, droppedEndNumber, lastNumber, ticketRemainder;
        boolean isValidTicket;

        ticketNumber = JOptionPane.showInputDialog(
            null, "Enter Ticket Number", 
            "Travel Information", JOptionPane.INFORMATION_MESSAGE);
        intTicketNumber = Integer.parseInt(ticketNumber);               //parsing to convert string to integer

        droppedEndNumber = (int)(intTicketNumber * 0.1);                //computations
        lastNumber = intTicketNumber - (droppedEndNumber * 10);   
        ticketRemainder = droppedEndNumber % 7;
        isValidTicket = (ticketRemainder == lastNumber);

        JOptionPane.showMessageDialog(null, "Ticket Validity: "+ isValidTicket, "Ticket Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
