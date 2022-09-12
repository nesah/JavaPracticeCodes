/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220911
 * 
 * 
 * About: Allow the user to input 4 kinds of integers and their name.
 * Utilizes the 4 types of integers and Scanner Class for user input
 */
import java.util.Scanner;
public class IntegerWithName {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        byte nByte;
        short nShort;
        int nInt;
        long nLong;
        String name;
        System.out.print("Input a byte integer >>> ");
        nByte = read.nextByte();
        System.out.print("Input a short integer >>> ");
        nShort = read.nextShort();
        System.out.print("Input an integer >>> ");
        nInt = read.nextInt();
        System.out.print("Input a long integer >>> ");
        nLong = read.nextLong();
        read.nextLine();
        System.out.print("Please input your name >>> ");
        name = read.nextLine();
        System.out.println("\nThanks, " + name + ".");
        System.out.println("The byte integer is " + nByte);
        System.out.println("The short integer is " + nShort);
        System.out.println("The integer is " + nInt);
        System.out.println("The long integer is " + nLong);
    }
}
