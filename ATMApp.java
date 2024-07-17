import java.util.Scanner;

class BankAccount{
	private double balance;
	public BankAccount(double intialbalance){
		balance = intialbalance;
		}
	public void deposit(double amount){
		if(amount>0){
			balance += amount;
			System.out.println("Deposit Successfully. New balance: $" + balance);
			}
		else{
			System.out.println("Invalid deposit amount.");
			}
		}
	public void withdraw(double amount){
		if(amount>0 && amount<= balance){
			balance -= amount;
			System.out.println("Withdrawal Successful. New balance: $" +balance);
			}
		else if(amount>balance){
			System.out.println("Insufficient balance.");
			}
		else{
			System.out.println("Invalid withdrawal amount.");
		}
	}
	public void checkBalance(){
		System.out.println("Your current balance is: $" +balance);
	}
}

class ATM{
	private BankAccount account;
	public ATM(BankAccount account){
		this.account=account;
		}
	
	public void Menu(){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("\nATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdrawal");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
choice = sc.nextInt();

		switch(choice){
		case 1: 
			account.checkBalance();
			break;
		case 2: 
			System.out.println("Enter the amount to deposit");
			account.deposit(sc.nextDouble());
			break;
		case 3: 
			System.out.println("Enter the amount to withdraw");
			account.withdraw(sc.nextDouble());
			break;
		case 4: 
			System.out.println("Thank you for using the ATM. Goodbye!");
			break;
			default:						System.out.println("Invalid choice. Please try again.");
			}
		}
		while(choice!=4);
	sc.close();
	}
}
public class ATMApp{
	public static void main(String[]args){
		BankAccount myAccount =new BankAccount(1000.0);
		ATM atm= new ATM(myAccount);
		atm.Menu();
	}
}
		


