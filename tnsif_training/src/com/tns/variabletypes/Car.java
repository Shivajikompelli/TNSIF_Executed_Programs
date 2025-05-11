package com.tns.variabletypes;

public class Car {
	    String model;

	    // Constructor that accepts a String
	    public Car(String model) {
	        this.model = model;
	    }

	    public static void main(String[] args) {
	        String c1 = new String("tesla");
	        String c2 = c1;//reference
	        String c3=new String("tesla");//new object

	        System.out.println(c1==c2);//true  
	        System.out.println(c1==c3);//false
	        System.out.println(c1.equals(c3));//true
	        System.out.println(c1.compareTo(c3));
	    }
	}


