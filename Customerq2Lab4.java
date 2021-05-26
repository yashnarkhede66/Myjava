import java.util.Scanner;

public class Customerq2Lab4 {
private String Name;
private String Email;
private int age;
private double CreditLimit;

public void acceptInfo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	Name=sc.nextLine();
	System.out.println("Enter the Email");
	Email=sc.nextLine();
	System.out.println("Enter the age");
	age=sc.nextInt();
	System.out.println("Enter the credit limit");
	CreditLimit=sc.nextInt();
}
public void setCreditLimit(double CreditLimit) {
	this.CreditLimit=CreditLimit;
}
public double getCreditLimit() {
	return CreditLimit;
}
public void showDetails() {
	System.out.println("you are  :"+Name+" "+Email+" "+age+"\nCreditLimit =" +getCreditLimit() );
}
}
