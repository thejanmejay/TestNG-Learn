package com.TestNGLearn;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	// @Test(timeOut = 2000) // This test will fail if it takes more than 1000 milliseconds
	// public void InfiniteLoopTest() {
	// 	int i = 1;
	// 	while (i == 1) { // This will cause a timeout exception
	// 		System.out.println("This is an infinite loop test." + i);
	// 	}
	// 

	@Test(expectedExceptions = NumberFormatException.class) // This test will pass if a Number
	public void test() {
		String x= "Happy";
		Integer.parseInt(x); // This will cause a NumberFormatException
	}

}
