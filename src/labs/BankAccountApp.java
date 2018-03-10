package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("57565", 1000);
		BankAccount acc2 = new BankAccount("75757", 2000);
		BankAccount acc3 = new BankAccount("34343", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
}

class BankAccount implements Iinterest {
	//properties
	private static int iD = 1000;
	private String accountNumber;
	private static final String routingNumber = "0534354";
	private String name;
	private String ssn;
	private double balance;
	
	//Constructors
	public BankAccount(String ssn, double initDeposit){
		balance = initDeposit;
		this.ssn = ssn;
		iD++;
		setAccountNumber();
	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		this.accountNumber = iD + "" + random + ssn.substring(0,2);
		//System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying Bill: " + amount);
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	public String toString() {
		return "[Name: " + name + " ]\n";
	}
}

