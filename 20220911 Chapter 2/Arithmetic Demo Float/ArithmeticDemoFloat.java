/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220912
 * 
 * 
 * About:[terminal] Allow the user to input 2 numbers that are double, 
 * add and subtract the 2 number and print their results and it average.
 * 
 */
import java.util.Scanner;
public class ArithmeticDemoFloat {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double num1, num2, sum, difference, average;

        System.out.print("Input the first double >>> ");
        num1 = read.nextDouble();
        System.out.print("input the second double >>> ");
        num2 = read.nextDouble();

        //computations
        sum = num1 + num2;
        difference = num1 - num2;
        average = sum/2;

        System.out.printf(num1+ " + " +num2+                        //using format specifier to control
         " = %.2f\n", sum);                                         //the number of significant digits to display
        System.out.printf(num1+ " - " +num2+
         " = %.2f\n", difference);
        System.out.printf("The average is %.2f", average);
    }
}
