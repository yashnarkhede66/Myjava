import java.util.Scanner;

public class Varargs {
public static void add(int...arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("sum of array elements" +sum);

}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	add(2,3,4,5);
	add(1,2,4,5,6,7,8,8,3,3,4,6,8,9);
	add(2,5,6,5,4,2,3,5,6,7,7,8,8,9,9,9,0,4,4,3,3,2,2,5);
}
}
