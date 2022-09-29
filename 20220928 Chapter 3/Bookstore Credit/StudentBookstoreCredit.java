/* 
 * by Shane A. Delos Reyes
 * date: 2022.09.28
 * about: Practicing class and objects. PG 175 #6 PART2.
 * 
 */
import java.util.Scanner;
public class StudentBookstoreCredit {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        BookstorCredit student1 = new BookstorCredit();
        String name;
        double points;
        int computedCredits;

        System.out.print("Enter your name: ");
        name = read.nextLine();
        System.out.print("Enter your point average: ");
        points = read.nextDouble();

        student1.setStudentName(name);
        student1.setPointAverage(points);
        computedCredits = student1.getComputedCredit(points);
        student1.getMessage(computedCredits);



    }
}
