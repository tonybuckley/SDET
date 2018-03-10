package oop;

public class BankAccountApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		
		
		//acc1.name = "Sarah";
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("54545");
		System.out.println(acc1.getSsn());
		
		
		acc1.accountNumber="55873873";
		acc1.balance = 10000;
		
		acc1.deposit(5000);
		acc1.deposit(2000);
		acc1.deposit(3000);
		acc1.withdraw(2000);
		
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber="643643634";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber="521324";
		acc3.checkBalance();
	
		//Demo of inheritance
		CDAccount cd1 = new CDAccount();
		cd1.name = "Sarah";
		cd1.accountNumber="55873873";
		cd1.balance = 10000;
		cd1.interestRate = "2.3%";
		System.out.println(acc1.toString());
		cd1.compound();
		*/
	}
	

}
