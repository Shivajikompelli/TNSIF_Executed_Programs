package com.tnsif.oops;

//public class Inheritance {
	
	class Animals{
		void eat() {
			System.out.println("Every Animal Eats");
		}

	}
	class Dog extends Animals{
		void sound() {
			System.out.println("the Dog barks");
		}
		
	}
	public class Inheritance{
		
	
	public static void main(String[] args) {
		
		Dog ob=new Dog();
		ob.eat();
		ob.sound();
		
		
	}
	}

