import java.util.Scanner;

public class StationaryShop {

	public static void main(String[] args) {
    String[] item = {"pen","pencil","notebook","bottle","colorbox"};
    System.out.println("Item no"     +      "Item"   );
    for(int i=0;i<item.length;i++) {
    	System.out.println(i+1+ "             "+ item[i]);
    	
    }
    
   
	System.out.println("..........PRESS 6 TO EXIT ---------->>>>>>>");
	Scanner sc= new Scanner(System.in);
	System.out.println("Choose the item you want to buy:");
	int n =sc.nextInt();
	switch(n) {
	
	case 1:
		System.out.println("enter the number of pen you want to buy:-");
		int a=sc.nextInt();
		System.out.println("total price for your purchase is:=" +a*10);
		break;
		
	case 2:
		System.out.println("enter the number of pencil you want to buy:-");
		int b=sc.nextInt();
		System.out.println("total price for your purchase is:=" +b*5);
		break;
			
	case 3:
		System.out.println("enter the number of notebook you want to buy:-");
		int c=sc.nextInt();
		System.out.println("total price for your purchase is:=" +c*20);
		break;
			
	case 4:
		System.out.println("enter the number of pen you want to buy:-");
		int d=sc.nextInt();
		System.out.println("total price for your purchase is:=" +d*30);
		break;
			
	case 5:
		System.out.println("enter the number of colourbox you want to buy:-");
		int e=sc.nextInt();
		System.out.println("total price for your purchase is:=" +e*50);
		break;
		
	case 6:
		break;
		default:
		System.out.println("Invalid Option");
		
	}

}
}
