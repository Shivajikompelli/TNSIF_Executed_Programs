package com.tnsif.oops;

public class BankMain {
	public static void main(String args[]) {
		
		BankImple ob = new BankImple();
		ob.withdraw(1000);
		ob.deposit(3000);
    //using instanceof
		if(ob instanceof BankImple) {
			   
	        ob.deposit(6767);
		
		
		}
		
	}
		

}
