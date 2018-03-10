package oop;

public class BankAccount implements IRate {
	
	//variables
	String accountNumber;
	private static final String routingNumber = "878767";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//constructors with overloading
	BankAccount() {
		System.out.println("New Account Created");
	}
	
	BankAccount(String accountType) {
		System.out.println("New Account Created " + accountType);
	}

	BankAccount(String accountType, double initDeposit) {
		String msg = null;
		System.out.println("Deposit of " + initDeposit);
		if (initDeposit < 1000) {
			msg="ERROR.  Minimum deposit must be at least $1000";
		}	
		else {
			msg="Thanks for your deposit";
		}
		System.out.println(msg);
		balance = balance + initDeposit;
	}

	
	// Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
	
	
	
	// methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("--DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("--WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println(activity);
		System.out.println("your balance is " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is: " + balance);
	}
	
	void getStatus() {
		
	}
	
	public String toString() {
		return name+accountNumber+balance+routingNumber;
	}
}

//end

