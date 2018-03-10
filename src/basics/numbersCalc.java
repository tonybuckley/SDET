package basics;

public class numbersCalc {

	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int mult = multiplyNumbers(numA, numB);
		System.out.println(mult);
	}
	
	static void printName() {
		System.out.println("My name is Tony");
	}
	

	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println(sum);
	}

	
	
	static int multiplyNumbers(int numberA, int numberB) {
		int product = numberA * numberB;
		return product;
	}
	
	
	
	
	
}
