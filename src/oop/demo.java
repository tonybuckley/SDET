package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	
	void eat() {
		System.out.println(name + " is eating");			
	}
	
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}

}


public class demo {

	public static void main(String[] args) {

		start();
		
		Person person1 = new Person();

		person1.name = "joe";
		person1.email = "joe@testmail.com";
		person1.phone = "07868534355";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "billyjoe";
		person2.email = "billy@testmail.com";
		person2.phone = "99999534355";
		
		person2.walk();
		person2.eat();
		person2.sleep();
		
		
	}

	 static void start() {
		System.out.println("Program is starting.");		
	}
	
}
