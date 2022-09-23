/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.24
 * about: Practicing class. This is a class 
 * that is  yet to be instantiated.
 * 
 * [UPDATE] This class has data fields, methods,
 * and constructors.
 * 
 */
public class SpaService {
    //these are the data fields
    private String serviceDescription;
    private double price;

    //these are the non-return methods
    public void setServiceDescription(String service){
        serviceDescription = service;
    }

    public void setPrice(double pr){
        price = pr;
    }

    //these are the return methods
    public String getServiceDescription(){
        return serviceDescription;
    }

    public double getPrice(){
        return price;
    }

    //creating constructors
    public SpaService(){
        serviceDescription = "XXX";
        price = 0;
    }
}
