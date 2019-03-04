import java.util.Random;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount object = new BankAccount();
		object.getName();
		object.getId();
		object.showMenu();

	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	
	
	

void deposit (int amount) {
	if(amount != 0) {
		balance = balance + amount;
		previousTransaction = amount;
	}
	
	}

void withdraw(int amount){
	if(amount != 0) {
		balance = balance - amount;
		previousTransaction = -amount;
	}
}
	
void getPreviousTransaction(){
	if (previousTransaction > 0) {
		System.out.println("Deposited: " + previousTransaction);
	}else if(previousTransaction < 0) {
		System.out.println("Withdraw: " + Math.abs(previousTransaction));
	}else {
		System.out.println("No transaction occured");
	}
	

	
}

void getName() {
	Scanner input = new Scanner(System.in);
	System.out.print("What is your name: " );
	String name = input.nextLine().toUpperCase();
	System.out.println("Welcome " + name);
	
}

void getId() {
	Random number = new Random();
	int n = 100000000 + number.nextInt(900000000);
	System.out.println("Your Id number is: " + n);
}

void showMenu() {
	
	char option = '\0';
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("\n");
	System.out.println("A. Check Balance");
	System.out.println("B. Deposit");
	System.out.println("C. Withdraw");
	System.out.println("D. Previous Transaction");
	System.out.println("E. Exit ");
	
	do
	{
		System.out.println("===============================================================================");
		System.out.println("Enter a option ");
		System.out.println("===============================================================================");
		option = scanner.next().toUpperCase().charAt(0);
		System.out.println("\n");
		
		switch(option) {
		
		case 'A':
			System.out.println("-------------------------");
			System.out.println("Balance = " + balance);
			System.out.println("-------------------------");
			System.out.println("\n");
			break;
			
		case 'B':
			System.out.println("-------------------------");
			System.out.println("Enter an amount to deposit:");
			System.out.println("-------------------------");
			int amount2 = scanner.nextInt();
			deposit(amount2);
			System.out.println("\n");
			break;
			
		case 'C':
			System.out.println("-------------------------");
			System.out.println("Enter an amount to withdraw:");
			System.out.println("-------------------------");
			int amount3 = scanner.nextInt();
			withdraw(amount3);
			System.out.println("\n");
			break;
			
		case 'D':
			System.out.println("-------------------------");
			getPreviousTransaction();
			System.out.println("-------------------------");
			System.out.println("\n");
			break;
			
		case 'E':
			System.out.println("*******************************************");
			break;
			
		default:
			System.out.println("Option does not exist. Try Again");
			break;
		
		}
		
		}while(option != 'E');
		
		System.out.println("Thank you for using our service. Have a wonderful day!");
	
	
}


}