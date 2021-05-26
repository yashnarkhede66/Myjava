
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String inputString = sc.nextLine();

       
        System.out.println("Uppercase string "+ inputString.toUpperCase());
         sc.close();
       
    }
}