package com.amdocs;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestClass2 {	
	
	@Category( SmokeTest.class)
	@Test
	public void testCase1() {
		System.out.println("Test class 2 - Test case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test class 2 - Test case 2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Test class 2 - Test case 3");
	}
	
}
