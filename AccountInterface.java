import java.util.Scanner;

public class AccountInterface {
	boolean exit;
	double amount;
	
	
	bankAccount bA = new bankAccount();
	public void rumMenu() {
		Scanner kbd = new Scanner(System.in);
		printHeader();
		System.out.println("Enter your name: ");
		bA.name=kbd.next();
		System.out.println("you account bank number is: " + bA.getOpenBankAccount()+"\n");
		
		int choice = 2;
		while(choice > 0) {
			System.out.println("please make a selection");
			System.out.println("1) Deposit money");
			System.out.println("2) Withdraw money");
			System.out.println("3) Check your balance");
			System.out.println("0) Exit");
			System.out.println("Please enter your selection here: ");
			choice = kbd.nextInt();
			if (choice == 1) {
				System.out.println("Please enter the amount deposit: ");
				double amount = kbd.nextDouble();
				bA.setDeposit(amount);
				System.out.println("Your amount deposit is: " + bA.getDeposit()+"$"+"\n");
			}
			if (choice == 2) {
				System.out.println("Please enter the withdraw amount: ");
				double amount = kbd.nextDouble();
				bA.setWithDraw(amount);
				System.out.println("Your withdraw amount is: " + bA.getWithDraw()+"$"+"\n");
			}
			if (choice == 3) {
				System.out.println("Your balance is: " + bA.getCheckBalance()+"\n");
			}
		}
		
	}
	
	private void printHeader() {
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("|        Hello to our        |");
		System.out.println("|     bank Account System    |");
		System.out.println("++++++++++++++++++++++++++++++\n");
	}
	
}



