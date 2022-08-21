import java.util.Scanner;

public class hourglass {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int Num1, i, j;
        System.out.print("Lapag number: ");
        Num1 = read.nextInt();

        for (i = 0; i < Num1; i++) {
            for (j = 0; j < Num1 + 1; j++) {

                if (j > i && j < Num1 - i)
                    System.out.print("* ");
                else
                    System.out.print("_ ");
            }
            System.out.println("");
        }
    }
}
