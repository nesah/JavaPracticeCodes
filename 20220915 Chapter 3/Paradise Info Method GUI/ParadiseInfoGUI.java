/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.15
 * about: [GUI]Practicing Methods. PG 126. 
 * 
 * [UPDATE] date: 2022.09.16
 * PG 140. Create a new method that will accept a minimum price
 * for the current week's feature discount and the percentage discount
 * and return the minimum amount the customer will save
 */
import javax.swing.*;
public class ParadiseInfoGUI {
    public static void main(String[] args){
        double price, discount, saving;
        String kbPrice, kbDiscount;

        kbPrice = JOptionPane.showInputDialog(
            null, "Enter the cutoff price for the discount",
            "Weekly Featured Discount", JOptionPane.INFORMATION_MESSAGE);
        price = Double.parseDouble(kbPrice);
        kbDiscount = JOptionPane.showInputDialog(
            null, "Enter the discount rate as a whole number",
            "Weekly Feature Discount", JOptionPane.INFORMATION_MESSAGE);
        discount = Double.parseDouble(kbDiscount);
        displayParadiseInfo();

        saving = customerDiscountInfo(price, discount);

        JOptionPane.showMessageDialog(
            null, "Special this week on any service over $"+
            price +"!\nDiscount of "+ discount +"%\nSave $"+ saving +"!!!", 
            "Weekly Feature Discount", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void displayParadiseInfo(){
        JOptionPane.showMessageDialog(null, 
        "Paradise Day Spa wants to pamper you.\nWe will make you look good.", 
        "Paradise Day Spa", JOptionPane.INFORMATION_MESSAGE);
    }

    public static double customerDiscountInfo(double price, double discount){
        double savings;
        return (savings = price * (discount * .10)); 
    }
}
