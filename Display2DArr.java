import java.util.Scanner;

class Display2DArr
{
   public static void main(String args[])
   {    
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Row length of an array : ");
	int row=sc.nextInt();
	System.out.println("Enter column length of an array : ");
	int column=sc.nextInt();
	int a[][]=new int[row][column];   	 
	System.out.print("Enter " + row*column + " Elements to Store in Array :\n");
        for (int i = 0; i < row; i++)
	{
	    for(int j = 0; j < column; j++)
	    {
           	a[i][j] = sc.nextInt();
	    }
	}   
        System.out.print("Elements in Array are :\n");
        for (int i = 0; i < row; i++)
	{
	    for(int j = 0; j < column; j++)
	    {
	       System.out.println("Row ["+i+"]:  Column ["+j+"] :"+a[i][j]);
 	    }
	    sc.close();
	}  
   }
}