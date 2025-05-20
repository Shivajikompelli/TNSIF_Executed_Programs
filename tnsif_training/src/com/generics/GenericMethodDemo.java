package com.tnsif.generics;

public class GenericMethodDemo {
	
	public static<T> void displayArray(T[] array) {
		
		//for (returntype variable name:arrayname)
		for(T i:array) {
			System.out.println("Array Elements:"+i);		
		}
	}

	
	
}
