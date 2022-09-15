/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.15
 * about: Practicing Methods. PG 126. 
 * 
 * [UPDATE] date: 2022.09.16
 * PG 140. Create a new method that will accept a minimum price
 * for the current week's feature discount and the percentage discount
 * and return the minimum amount the customer will save
 */
import java.util.Scanner;
public class ParadiseInfo {
    public static void main(String[] argse){
        Scanner read = new Scanner(System.in);
        double price, discounts, savings;

        System.out.print("Enter the cutoff price for the discount >>    ");
        price = read.nextDouble();
        System.out.print("Enter the discount rate as a whole number >>  ");
        discounts = read.nextDouble();
        displayInfo();       

        savings = customerDiscountInfo(price, discounts);

        System.out.println("\nSpecial this week on any service over $"+ price + "!");
        System.out.println("Discount of "+ discounts +"%");
        System.out.println("Save $"+ savings +"!!!");

        read.close();
  
    }

    public static double customerDiscountInfo(double price, double discounts){
        double savings;
        savings = price * (discounts * .10);
        return savings;

    }

    public static void displayInfo(){
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
}
