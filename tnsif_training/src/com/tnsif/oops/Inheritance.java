package com.tnsif.oops;
//inheritance demo
	
// creating a class for Animals
	class Animals{
		void eat() {
			System.out.println("Every Animal Eats");
		}

	}
//creating a class dog and acquiring properties of Animals using extends keyword
	class Dog extends Animals{
		void sound() {
			System.out.println("the Dog barks");
		}
		
	}
	public class Inheritance{
		
	
	public static void main(String[] args) {
		//creating instance
		Dog ob=new Dog();
		ob.eat();
		ob.sound();
	}
	}

