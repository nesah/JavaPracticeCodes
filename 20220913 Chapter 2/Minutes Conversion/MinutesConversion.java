/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220913
 * 
 * 
 * About: Convert minutes to hours and days
 * 
 */
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        final float MINUTES_IN_HOUR = 60f;
        final float HOURS_IN_DAYS = 24f;
        int minToHour;
        float minutes, remainderMins, minToDays, finalMinToHours;

        System.out.print("Input the minutes:  ");
        minutes = read.nextInt();

        //computations for minutes to hours
        minToHour = (int) minutes / (int) MINUTES_IN_HOUR;
        remainderMins = (0.01f) * (minutes % MINUTES_IN_HOUR);
        finalMinToHours = minToHour + remainderMins;
        System.out.printf("%.2f", finalMinToHours);

        //computations for minutes to days


    }
}
