import java.util.Scanner;
class Palindrome
{
          public static void main(String args[])
		  {
			       Scanner s=new Scanner(System.in);
				   System.out.println("Enter the number:");
				   s.close();
		           int no=s.nextInt();
				   int temp=no;
				   int rev=0,rem;
				   while(temp !=0)
				   {
				             rem=temp%10;
							 rev=rev*10+rem;
							 temp=temp/10;
							 
					}
                    if(no==rev)
                    {
					         System.out.println(no+"is a palindrome number");
					}
                    else
                    {
                             System.out.println(no+"is not a palindrome number");					
                    }					
				  
		  }
}
		  