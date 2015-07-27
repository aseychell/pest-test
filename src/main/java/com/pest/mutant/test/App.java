package com.pest.mutant.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Algorithm alg = new Algorithm();
    	int a = 1;
    	int b = 1;
        System.out.println(a+"+"+b+"="+alg.sum(a, b) );
        int c = 1;
    	System.out.println(a+"+"+b+"+"+c+"="+alg.sum(a, b, c) );
    	
    	System.out.println(a+"-"+b+"="+alg.subtract(a, b) );
    	
    	System.out.println(a+"-"+b+"-"+c+"="+alg.subtract(a, b, c) );
    	
    	System.out.println(a+"*"+b+"="+alg.multiply(a, b) );
    	
    	System.out.println(a+"*"+b+"*"+c+"="+alg.multiply(a, b, c) );
    	
    	System.out.println(a+"/"+b+"="+alg.divide(a, b) );
    	
    	System.out.println(a+"/"+b+"/"+c+"="+alg.divide(a, b, c) );
    	
    }
}
