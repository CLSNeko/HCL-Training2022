import java.util.Scanner;

public class Fibonacci {

	static int fibo(int num){

		if (num == 0){
			return 0;
		}
		else if (num == 1){
			return 1;
		}
		else {
			return fibo(num-1) + fibo(num-2);
		}
	}

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		System.out.println("Enter the number here.");
		String userNum = userIn.nextLine();
		int num = Integer.parseInt(userNum);
		System.out.println("Number " + num + " in the fibonacci series is " + fibo(num) + ".");
	}
}
