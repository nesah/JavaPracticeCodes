/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.28
 * about: Practicing class and objects. PG 175 #6.
 * 
 */
public class BookstorCredit {
    private String studentName;
    private double pointAverage;

    public void setStudentName(String name){
        studentName = name;
    }

    public void setPointAverage(double points){
        pointAverage = points;
    }

    public int getComputedCredit(double pointAverage){
        int computedCredit;
        computedCredit = (int)(10*pointAverage);
        return computedCredit;
    }
    
    public void getMessage(int computedCredit){
        System.out.println(studentName +", "+ pointAverage +" points");
        System.out.println("You have the credit/s of: "+ computedCredit);
    }
}
