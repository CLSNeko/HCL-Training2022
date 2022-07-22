import java.util.Scanner;

public class Bank{

	static int deposit(int amount, int balance){
		return amount + balance;
	}
	static int withdraw(int amount, int balance){
		if (balance >= amount){
			return balance - amount;
		} else {
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		boolean bankOpen = true;
		String response;
		int amount;
		while (bankOpen){
			System.out.println("Welcome to the bank, Would you like to Deposit, Withdraw, or Exit?");
			System.out.println("Your current balance is: " + balance);	
			response = scan.nextLine();
			if (response.equals("deposit")){
				System.out.println("How much do you wish to deposit?");
				amount = Integer.parseInt(scan.nextLine());
				System.out.println("Depositing " + amount + "...");
				balance = Bank.deposit(amount, balance);
			} else if (response.equals("withdraw")) {
				System.out.println("How much do you wish to withdraw?");
				amount = Integer.parseInt(scan.nextLine());
				System.out.println("Withdrawing " + amount + "...");
				balance = Bank.withdraw(amount, balance);
			} else {
				System.out.println("Exiting bank...");
				bankOpen = false;
			}
		}
	}
}
