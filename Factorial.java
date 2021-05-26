import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        int no;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        sc.close();
        long fact = 1;
        int i = 1;
        while(i<=no)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+no+" is: "+fact);
    }
}