/* 
 * by Shane A. Delos Reyes
 * date: 2022.10.01
 * about: Practici methods. PG 175 #7.
 * 
 */
import java.util.Scanner;
public class MetricConversion{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        final float cmInInch = 2.54f;
        final float litersInGallons = 3.7834f;
        int inches;
        int gallons;
        float centimeters, liters;

        System.out.print("Enter inches: ");
        inches = read.nextInt();
        System.out.print("Enter gallons: ");
        gallons = read.nextInt();

        centimeters = getCentimeters(inches, cmInInch);
        liters = getLiters(gallons, litersInGallons);
        System.out.print(inches +" inches to centimeters is "+
            centimeters +"\n" + gallons +" gallons in liters is "+
            liters +".");

    }

    public static float getCentimeters(int inches, float cmInInch){
        float convertedInches;
        convertedInches = cmInInch * inches;
        return convertedInches;
    }

    public static float getLiters(int gallons, float litersInGallons){
        float convertedGallons;
        convertedGallons = litersInGallons * gallons;
        return convertedGallons;
    }
}