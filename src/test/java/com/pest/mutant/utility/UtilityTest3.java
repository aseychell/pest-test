package com.pest.mutant.utility;

import junit.framework.TestCase;

public class UtilityTest3 extends TestCase {

	private final Utility utility = new Utility();
	
	public void testPlusAndMinusAndMultiplyAndDivide() {
		assertEquals(0, utility.plusAndMinusAndMultiplyAndDivide(1, 2, 3, 4, 5));
	}

	public void testPlusAndMinusAndMultiplyAndDivideWithException() {
		try {
			utility.plusAndMinusAndMultiplyAndDivide(1, 2, 3, 4, 0);
			fail("expected exception");
		}
		catch(IllegalArgumentException e) {
			//! ok
		}
	}	
}
