import java.util.Scanner;

public class inputname {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        String Name;
        System.out.println("Hi! What's your name?");
        Name = read.nextLine();

        System.out.println("Hello, "+ Name +"!");
    }
}
