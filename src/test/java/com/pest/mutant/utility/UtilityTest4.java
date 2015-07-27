package com.pest.mutant.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilityTest4 {

	private final Utility utility = new Utility();
	
	@Test
	public void testPlusAndMinusAndMultiplyAndDivide() {
		assertEquals(0, utility.plusAndMinusAndMultiplyAndDivide(1, 2, 3, 4, 5));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testPlusAndMinusAndMultiplyAndDivideWithException() {		
		utility.plusAndMinusAndMultiplyAndDivide(1, 2, 3, 4, 0);		
	}	
}
