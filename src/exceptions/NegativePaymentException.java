package exceptions;

public class NegativePaymentException extends Exception {

	double payment;
	
	public NegativePaymentException(double payment) {
	
		this.payment = payment;
		
	}
	
	public String toString() {
		return "Error: cannot take negative payment: " + payment;
	}
	
}
