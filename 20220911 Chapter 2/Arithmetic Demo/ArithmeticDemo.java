/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220912
 * 
 * 
 * About:[terminal] Allow the user to input 2 numbers, 
 * add and subtract the 2 number and print their results and it average.
 * 
 */
import java.util.Scanner;
public class ArithmeticDemo {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int num1, num2, sum, difference, average;

        System.out.print("Input the first integer >>> ");
        num1 = read.nextInt();
        System.out.print("Input the second integer >>> ");
        num2 = read.nextInt();

        //computations
        sum = num1 + num2;
        difference = num1 - num2;
        average = sum/2;

        System.out.println(num1+ " + " +num2+
            " = " +sum);
        System.out.println(num1+ " - " +num2+
            " = " +difference);
        System.out.println("The average is " +average);
    }
}
