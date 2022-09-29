/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.30
 * about: Practicing class and objects. PG 175 #5.
 * 
 */
import java.util.Scanner;
public class Percentages {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        System.out.print("First number: ");
        firstNumber = read.nextDouble();
        System.out.print("Second number: ");
        secondNumber = read.nextDouble();
        computePercent(firstNumber, secondNumber);
    }
    
    public static void computePercent(double firstNumber, double secondNumber){
        double quotient;
        int percent;
        quotient = firstNumber/secondNumber;
        percent = (int)(quotient*100);
        
        System.out.printf("%.2f is ", firstNumber);
        System.out.print(percent +" percent of ");
        System.out.printf("%.2f.", secondNumber);
    } 
}
