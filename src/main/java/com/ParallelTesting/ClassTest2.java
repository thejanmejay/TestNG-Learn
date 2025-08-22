package com.ParallelTesting;

import org.testng.annotations.Test;

public class ClassTest2 {

@Test(priority = 4)
		public void testMethod21() {
			
			System.out.println("Test Method 1 from ClassTest2 is running " + Thread.currentThread().getId());
		}
		@Test(priority = 5)
		public void testMethod22() {
			System.out.println("Test Method 2 from ClassTest2 is running " + Thread.currentThread().getId());
		}
		@Test(priority = 6)
		public void testMethod23() {
			System.out.println("Test Method 3 from ClassTest2 is running " + Thread.currentThread().getId());
		}
	
}
