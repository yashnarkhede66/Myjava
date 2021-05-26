import java.util.Scanner;

public class Lab4_1 {
private int date;
private String month;
private int year;

public void accept()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Date");
	date=sc.nextInt();
	
	System.out.println("enter Month");
	month=sc.nextLine();
	
	System.out.println("enter year");
	year=sc.nextInt();
	
	sc.close();
	
	public void display()
	{
		System.out.println("today is ");
		System.out.println(date+"  "+month+" "+year);
		System.out.println("use mask and sanitizer");
	}
}

}
