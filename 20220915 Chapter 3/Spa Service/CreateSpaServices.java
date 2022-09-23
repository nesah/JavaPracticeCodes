/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.24
 * about: Practicing objects. this is an
 * instantiate object of the class SpaService.
 * PG 157.
 * 
 */
import java.util.Scanner;
public class CreateSpaServices {
    public static void main(String[] args){
        //create object for the scanner
        Scanner read = new Scanner(System.in);
        //create the object for the class
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        //create variables
        String service;
        double price;

        //prompt for the description and price
        System.out.println("First service description >> ");
        service = read.nextLine();
        System.out.println("Enter the price >> ");
        price = read.nextDouble();
        //put the description and price in the date fields
        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        //repeat for the secondService
        //buffer first
        //read.nextLine();
        //System.out.println("Second service description >> ");
        //service = read.nextLine();
        //System.out.println("Enter the price >> ");
        //price = read.nextDouble();
        //secondService.setServiceDescription(service);
        //secondService.setPrice(price);

        //Display all
        System.out.println(firstService.getServiceDescription() +" $"+ firstService.getPrice());
        System.out.println(secondService.getServiceDescription() +" $"+ secondService.getPrice());
    }
}
