//average score of all - totalStudents, sections//
//highest exam score among all - sections//
//lowest exam score among all - sections
//mode - sections, totalStudents // return:
//median - sections
import java.util.Scanner;
public class methods_2{
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int[] sections = new int[100]; //no matter how many sections, it will all be stored in one array
        int[] sizeOfArrays = new int[100];  //number of students in each section
        int[] tempSection = new int[100];
        int k = 0, l = 0, j, totalStudents = 0, numberOfSections;
        double averagePerSection, totalAverage;
        int highestPerSection, lowestPerSection, totalHighest, totalLowest, mode, median;
        //input number of sections
        System.out.print("Enter number of section: ");
        numberOfSections = read.nextInt();
        //ask how many student per section tas keep it in an array variable
        for(int i = 0; i < numberOfSections; i++){
            System.out.print("Enter the number of students in section "+(i+1)+ ": ");
            sizeOfArrays[i] = read.nextInt();
            totalStudents += sizeOfArrays[i];
        }
        //taking exam scores
        for(int i = 0; i < numberOfSections; i++){      //1st loop for section
            for(j = k; j < sizeOfArrays[i]+k; j++){     //2nd loop for size of array or number of students
                l++;
                System.out.print("Enter the exam score of student number "+l+" in section "+(i+1)+": ");
                sections[j] = read.nextInt();
            }
            k = j;
            l = 0;
        }
        /* AVERAGE PER SECTION:
        Here, ililipat ko yung sections sa temporary section array
        para yun yung ipapasa ko sa method 
        */
        j = 0;
        k = 0;
        l = 0;
        for(int i = 0; i < numberOfSections; i++){
            int studentsPerSection = sizeOfArrays[i];
            for(j = k; j < studentsPerSection+k; j++){
                tempSection[l] = sections[j];
                l++;
            }
            averagePerSection = Average(tempSection, studentsPerSection); //pass the temporary section to method
            System.out.println("Average of Section "+(i+1)+": "+ String.format("%.2f", averagePerSection));
            k = j;
            l = 0;
        }
        //TOTAL AVERAGE
        totalAverage = AverageTotal(sections, totalStudents);
        System.out.printf("The average of students from all sections: %.2f", totalAverage);
        System.out.println(" ");
        //HIGHEST SCORE PER SECTION using temporary section arrays
        j = 0;
        k = 0;
        l = 0;
        for(int i = 0; i < numberOfSections; i++){
            int studentsPerSection = sizeOfArrays[i];
            for(j = k; j < studentsPerSection+k; j++){
                tempSection[l] = sections[j];
                l++;
            }
            highestPerSection = HighestPerSection(tempSection, studentsPerSection); //pass the temporary section to method
            System.out.println("Highest score in Section "+(i+1)+": "+highestPerSection);
            k = j;
            l = 0;
        }
        //HIGHEST SCORE OVERALL
        totalHighest = TotalHighest(sections, totalStudents);
        System.out.println("Highest score in all sections: "+totalHighest);
        //MODE 
        //mode = 

        //MEDIAN
        System.out.print("Median of the scores: "); 
        if(totalStudents%2 == 0){
            for(int i = 0; i < 2; i++){
                median = MedianScores(i, totalStudents) - 1;
                System.out.print(sections[median]+" ");
            }
        }
        else if(totalStudents%2 != 0){
            int i = 0;
            median = MedianScores(i, totalStudents);
            System.out.print(sections[median]+" ");
        }

    }

    public static double Average(int[] tempSection, int studentsPerSection){
        double average;
        double sum = 0;
            for(int i = 0; i < studentsPerSection; i++){
                sum += tempSection[i];
            }
            average = sum / studentsPerSection;
        return average;
    }

    public static double AverageTotal(int[] sections, int totalStudents){
        double sum = 0;
        for(int i = 0; i < totalStudents; i++){
            sum += sections[i];
        }
        return sum/totalStudents;
    }

    public static int HighestPerSection(int[] tempSection, int studentsPerSection){
        int higher = 1;
        for(int i = 0; i < studentsPerSection; i++){
            if(tempSection[i] > tempSection[higher]){
                higher = i;
            }
        }
        return tempSection[higher];
    }

    public static int TotalHighest(int[] sections, int totalStudents){
        int highest = 1;
        for(int i = 0; i < totalStudents; i++){
            if(sections[i] > sections[highest]){
                highest = i;
            }
        }
        return sections[highest];
    }

    public static int MedianScores(int i, int totalStudents){
        int secondMedian;
        secondMedian = (totalStudents/2) + 1;
        if(i == 0){
            return totalStudents/2;
        }
        else if(i > 0){
            return secondMedian;
        }
        return 0;
    } 

}