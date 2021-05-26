import java.util.Scanner;

public class AddTwoNos {
public static void main(String[] args) {
	
	int no1 , no2, sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number");
	no1 = sc.nextInt();
	
	System.out.println("Enter Second Number");
	no2 = sc.nextInt();
	
	sc.close();
	sum= no1 + no2;
	System.out.println("Sum of these numbers is "+sum);
	
	
	
}
}
