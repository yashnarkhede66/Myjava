import java.util.Scanner;
public class ReverseNumber
{
public static void main(String[] args) {
int num;
Scanner sc = new  Scanner(System.in);
System.out.println("Print the number");
num = sc.nextInt();
sc.close();
int rnum=0;
while(num>0)
{
rnum=(rnum*10)+(num%10);
num=num/10;
}
System.out.println(rnum);
}
}