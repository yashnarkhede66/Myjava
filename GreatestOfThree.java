import java.util.Scanner;

public class GreatestOfThree{

  public static void main(String[] args) {
     
      int num1 ,num2 ,num3;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1'st Number");
      num1 = sc.nextInt();
      sc.close();
      
      System.out.println("Enter 2'nd number");
      num2 = sc.nextInt();
      
      System.out.println("Enter 3'rd number");
      num3 = sc.nextInt();

      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
  }
}