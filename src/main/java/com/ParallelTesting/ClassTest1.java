package com.ParallelTesting;

import org.testng.annotations.Test;

public class ClassTest1 {
		
		@Test(priority = 1)
		public void testMethod11() {
			
			System.out.println("Test Method 1 from ClassTest1 is running " + Thread.currentThread().getId());
		}
		
	@Test(priority = 2)
	public void testMethod12() {
		System.out.println("Test Method 2 from ClassTest1 is running " + Thread.currentThread().getId());
	}
	@Test(priority = 3)
	public void testMethod13() {
		System.out.println("Test Method 3 from ClassTest1 is running " + Thread.currentThread().getId());
	}

}
