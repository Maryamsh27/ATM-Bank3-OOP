import java.util.Scanner;
import java.util.Date;
public class Account {
	
	
	//Class Variable 
	int balance;
	int prevTransaction;
	String customerName;
	String customerID;
	
	//Class Constructor 
	Account (String cname, String cid){
	
		customerName=cname;
		customerID=cid;
	}
	void deposit(int amount) {
		if (amount !=0 && amount >0) {
			balance=balance+amount;
			prevTransaction = amount;
		}
	}
	void withdraw(int amount) {
		if (amount !=0) {
			balance-=amount;
			prevTransaction=-amount;
		}
	}
	void getprevTransaction() {
		if (prevTransaction > 0) {
			System.out.println("Deposit:"+ prevTransaction);
		}else if (prevTransaction < 0) {
			System.out.println("Withdraw:"+Math.abs(prevTransaction));
		}else {
			System.out.println("No Transaction Occured");
		}
		
	}
	
	void showMenu() {
		char option ='\0';
		Scanner scanner= new Scanner (System.in);
		System.out.println("welcome, "+customerName + "!");
		System.out.println("You ID is:"+customerID + "!");
		System.out.println();
		System.out.println("What would you like to do ? ");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdraw");
		System.out.println("D. View perv Transaction");
		System.out.println("E. Exit");
		System.out.println("F. show date");
	
		
		do {
			System.out.println();
			System.out.println("Please Enter an option");
			char option1 =scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();

			
	switch (option) {
	case 'A':
		System.out.println("====================");
		System.out.println("Balance=$" + balance);
		System.out.println("====================");
		break;
		
	case 'B':
		System.out.println("Enter an amount  to deposit: ");
		int amount =scanner.nextInt();
		deposit(amount);
		break;
		
	case 'C':
		System.out.println("Enter an amount  to Withdraw: ");
		int amount2 =scanner.nextInt();
		deposit(amount2);
		break;
		
	case 'D':
		System.out.println("====================");
		getprevTransaction();
		System.out.println("====================");
		break;
		
	case 'E':
		System.out.println("====================");
		break;
		
	case 'F':
		Date date1=new Date();
		System.out.println(date1);
		break;
		
		default:
			System.out.println("Error:Invalid Option.Please Enter A,B,C,D,E");
			break;

		}
	}
	
	while (option != 'E');
	System.out.println("Thank you for using our ATM");


}
