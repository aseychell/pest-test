package com.pest.testsuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.pest.mutant.test.AlgorithmTest;
import com.pest.mutant.utility.UtilityTest4;

@RunWith(Suite.class)
@SuiteClasses({ 
	//AlgorithmTest3.class,
	AlgorithmTest.class,
	//UtilityTest3.class,
	UtilityTest4.class})
public class AllTests {

}
