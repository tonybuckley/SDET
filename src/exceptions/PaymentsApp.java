package exceptions;

import java.util.Scanner;

public class PaymentsApp {
	
	public static void main(String[] args) {
		double payment = 0;
		boolean positiveP = true;
		
		
		do {
			System.out.print("Enter the Payment Amount: ");
	
			Scanner in = new Scanner(System.in);
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positiveP = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				positiveP = false;
			}
		} while (!positiveP); 
		
		System.out.println("Thank you for your payment" + payment);
		
	}
}
