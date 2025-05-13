
package com.tnsif.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

//demo for list interface and its implementation class
public class ListDemo {
	
	public static void main(String args[]) {
		
		//Wrapper class
		//int --> Integer  , float --> Float , double --> Double, short --> Short
		
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(22);
		ll.add(33);
		//ll.add("Sri Indu");
		//ll.add(3.14f);
		//ll.add("true");
		
		for(int i:ll) {
			System.out.println("The elements in List Interface"+" "+i);
		}
		
		
		
	}

}
