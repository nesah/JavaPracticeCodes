/* by Shane A. Delos Reyes
 * 
 * 
 * Date: 20220910
 * 
 * 
 * About: A user will guess what number will be generated by the computer.
 * Two dialog box will appear in sequence; the user will input a number on the first box 
 * and the program will generate a random number on the next box.
 */
import javax.swing.JOptionPane;
public class RandomGuess {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "The number is " + ( 1+ ( (int)(Math.random()*10) ) ));
    }     
}