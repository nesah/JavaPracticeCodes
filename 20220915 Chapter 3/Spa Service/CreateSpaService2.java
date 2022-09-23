/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.24
 * about: Practicing objects. this is an
 * instantiate object of the class SpaService.
 * PG 157.
 * 
 */
import java.util.Scanner;
public class CreateSpaService2 {
    public static void main(String[] args){
        //create the object for the class
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        firstService = getData(firstService);
        secondService =  getData(secondService);

        //Display all
        System.out.println(firstService.getServiceDescription() +
            " $"+ firstService.getPrice());
        System.out.println(secondService.getServiceDescription() +
            " $"+ secondService.getPrice());
    }

    public static SpaService getData(SpaService s){
        String service;
        double price;
        Scanner read = new Scanner(System.in);
        //prompt user for inputs
        System.out.print("Service description >> ");
        service = read.nextLine();
        System.out.print("Price >> ");
        price = read.nextDouble();
        read.nextLine();
        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
    }
}
