/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.28
 * about: Practicing class and objects. PG 175.
 * 
 */
import java.util.Scanner;
public class NumberDemo {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int firstNum, secondNum;
        //prompting the user for number
        System.out.print("Enter first number: ");
        firstNum = read.nextInt();
        System.out.print("Enter second number: ");
        secondNum = read.nextInt();
        //passing it to the method
        displayTwiceTheNumber(firstNum, secondNum);
        displayNumberPlusFive(firstNum, secondNum);
        displayNumberSquared(firstNum, secondNum);
    }

    public static void displayTwiceTheNumber(int num1, int num2){
        System.out.println("Twice the number: "+
            (num1*2) +", " + (num2*2));
    }

    public static void displayNumberPlusFive(int num1, int num2){
        System.out.println("Number plus five: "+
            (num1+5) +", "+ (num2+5));
    }

    public static void displayNumberSquared(int num1, int num2){
        System.out.println("Number squared: "+ 
            (num1*num1) +", "+ (num2*num2));
    }
}
