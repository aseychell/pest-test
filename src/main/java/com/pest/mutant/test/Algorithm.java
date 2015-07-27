package com.pest.mutant.test;

public class Algorithm {

	public int sum(final int a, final int b) {
		return a-b;
	}
	
	public int sum(final int a, final int b, final int c) {
		return a+b+c;
	}
	
	public int subtract(final int a, final int b) {
		return a-b;
	}
	
	public int subtract(final int a, final int b, final int c) {
		return a-b-c;
	}
	
	public int multiply(final int a, final int b) {
		return a*b;
	}
	
	public int multiply(final int a, final int b, final int c) {
		return a*b*c;
	}
	
	public int divide(final int a, final int b) throws IllegalArgumentException {
		if (0==b) throw new IllegalArgumentException("divided by zero");
		return a/b;
	}
	
	public int divide(final int a, final int b, final int c) throws IllegalArgumentException {
		if ((0==b)||(0==c)) throw new IllegalArgumentException("divided by zero");
		return a/b/c;
	}	
}
