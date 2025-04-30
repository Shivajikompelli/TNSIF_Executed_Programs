package com.tnsif.oops;
//method overloading
public class Cal {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public float add(float a,float b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		
		Cal ob=new Cal();
		System.out.println(ob.add(8.4f, 12.0f));
		System.out.println(ob.add(12,15));
	}

}
