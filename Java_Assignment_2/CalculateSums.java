import java.util.Scanner;

public class CalculateSums {
	
	public static void main(String[] args){
		Scanner userIn = new Scanner(System.in);
		System.out.println("Enter the Value of Integer A:");
		int a = Integer.parseInt(userIn.nextLine());
		System.out.println("Enter the Value of Integer B:");
		int b = Integer.parseInt(userIn.nextLine());
		System.out.println("Enter the Value of Integer C:");
		int c = Integer.parseInt(userIn.nextLine());
		int sum = a+b;
		System.out.println("A+B = " + sum);
		if (sum == c){
			System.out.println("A+B = C");
		}
		else {	
			System.out.println("A+B != C");
		}
	}
}
