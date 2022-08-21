import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int Num1, i, j;
        System.out.print("Lapag number: ");
        Num1 = read.nextInt();

        for (i = 0; i < Num1; i++) {

            for (j = 0; j < Num1 - i; j++) {
                System.out.print("_ ");
            }
            for (j = 0; j < Num1; j++) {
                System.out.print("* ");
            }
            if(Num1 - i < Num1){
                for (j = 0; j < i; j++) {
                    System.out.print("_ ");
                }
            }

            System.out.print(" \n");
        }
    }
}
