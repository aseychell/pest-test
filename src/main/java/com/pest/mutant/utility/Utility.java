package com.pest.mutant.utility;

public class Utility {

	public int plusAndMinusAndMultiplyAndDivide(int a, int b, int c, int d, int e) throws IllegalArgumentException {
		if (0==e) throw new IllegalArgumentException("divided by zero");
		return (a+b-c)*d/e;						
	}
	
}
