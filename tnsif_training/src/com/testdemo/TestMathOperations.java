package com.tnsif.testdemo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestMathOperations {
	
	
	//positive number
	@Test
	public void testForPositive() {
		
		Assertions.assertTrue(MathOperations.positveNumber(5));
	}
	
	
	//negative number
	@Test
	public void testForNegative() {
		
		Assertions.assertFalse(MathOperations.positveNumber(-5));
		
		
	}

}
