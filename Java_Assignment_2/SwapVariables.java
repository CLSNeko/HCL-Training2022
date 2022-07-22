import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args){
		Scanner userIn = new Scanner(System.in);
		System.out.println("Value of Integer A?");
		int a = Integer.parseInt(userIn.nextLine());
		System.out.println("Value of Integer B?");
		int b = Integer.parseInt(userIn.nextLine());
		System.out.println("Value of A=" + a);
		System.out.println("Value of B=" + b);
		System.out.println("Swapping Variables!");
		int c = a;
		a = b;
		b = c;
		System.out.println("Value of A=" + a);
		System.out.println("Value of B=" + b);
	}
}
