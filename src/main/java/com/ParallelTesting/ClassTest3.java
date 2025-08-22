package com.ParallelTesting;

import org.testng.annotations.Test;

public class ClassTest3 {

	@Test(priority = 7)
	public void testMethod31() {
		System.out.println("Test Method 1 from ClassTest3 is running " + Thread.currentThread().getId());
	}
	@Test(priority = 8)
	public void testMethod32() {
		System.out.println("Test Method 2 from ClassTest3 is running " + Thread.currentThread().getId());
	}
	@Test(priority = 9)
	public void testMethod33() {
		System.out.println("Test Method 3 from ClassTest3 is running " + Thread.currentThread().getId());
	}

}
