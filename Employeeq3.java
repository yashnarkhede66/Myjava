import java.util.Scanner;

public class Employeeq3 {
private int Id;
private String Name;
private double Salary;
private double HRA;
private double Medical;
private double PF;
private double PT;
private double NetSalary;
private double GrossSalary;

public void employeeinfo()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Id");
	Id=sc.nextInt();
	System.out.println("Enter the Name");
	Name=sc.next();
	System.out.println("Enter the Salary");
	Salary=sc.nextDouble();
	
}
public void employeedetails()
{
	HRA=0.5*Salary;
	PF=0.12*Salary;
	GrossSalary=Salary+HRA+Medical;
	NetSalary=GrossSalary-(PT+PF);
	System.out.println(Id);
	System.out.println(Name);
	System.out.println(Salary);
	System.out.println(HRA);
	System.out.println(PF);
	System.out.println(Medical);
	System.out.println(PT);
	System.out.println(NetSalary);
	System.out.println(GrossSalary);
}
}
