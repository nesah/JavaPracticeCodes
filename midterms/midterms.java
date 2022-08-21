import java.util.Scanner;

/*hinati ko sa tatlo: upper, mid, lower 
 everytime na nadadagdagan yung lines sa upper&lower part,
 -2 sa underscore, +2 sa asterisk*/

public class midterms{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int Num, asterisk = 1;

        System.out.print("Input an odd number");
        Num = read.nextInt();

        int UpperLowerLines = Num / 3;        //para sa lines sa upper and lower
        int Num_1 = Num;                      //copy lang dito yung value ni Num para di mawala

        for(int i = 0; i < UpperLowerLines; i++){
                for(int k = 0; k < Num_1/2; k++){     //underscore
                    System.out.print("_ ");
                }

                for(int m = 0; m < asterisk; m++){     //asterisk
                    System.out.print("* ");
                }

                for(int k = 0; k < Num_1/2; k++){     //underscore
                    System.out.print("_ ");
                }
            asterisk += 2;
            Num_1 = Num_1 - 2;
            System.out.println(" ");
        }

        //mid
        for(int i = 1; i < 3; i++){

            if(i == 2){
                for(int k = 0; k < 1; k++){
                    System.out.print("_ ");
                }

                for(int l = 0; l < Num - 2; l++){
                    System.out.print("* ");
                }

                for(int k = 0; k < 1; k++){
                    System.out.print("_ ");
                }
                System.out.println(" ");
            }

            for(int j = 0; j < Num; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}