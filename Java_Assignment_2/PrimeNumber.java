import java.util.Scanner;

public class PrimeNumber {

	static void checkPrime(int n){
		int prime = 0;
		for (int i = 2; i <= n/2; i++){
			if (n % i == 0){
				System.out.println("Number is not Prime");
				prime = 1;
				break;
			}
		}
		if (prime == 0){
			System.out.println("Number is Prime");
		}
	}
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.println("Enter in a Number");
		String num = userNum.nextLine();
		checkPrime(Integer.parseInt(num));
	}
}
