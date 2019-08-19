package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RPNCalculatorTest {
	
	private RPNCalculator rpnCalculator;
	private double actualResult, expectedResult;
	
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before class method");
	}
	
	@Before
	public void init() {
		System.out.println("Before method");
		rpnCalculator = new RPNCalculator();
		actualResult = expectedResult = 0.0;
	}
	
	@After
	public void cleanUp() {
		rpnCalculator = null;
		System.out.println("After method");
	}	
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After class method");
	}
	
	@Category( SmokeTest.class)
	@Test
	public void testSimpleAddition() {
		
		System.out.println("Test Addition");
		actualResult = rpnCalculator.evaluate( "10 15 +" );
		expectedResult = 25.0;
		assertEquals ( expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate( "10 115 +" );
		expectedResult = 125.0;
		
		assertEquals ( expectedResult, actualResult, 0.0001);

	}
	
	@Test
	public void testSimpleSubtraction() {
		
		System.out.println("Test Subtraction");
		actualResult = rpnCalculator.evaluate( "100 15 -" );
		expectedResult = 85.0;
		assertEquals ( expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate( "10 5 -" );
		expectedResult = 5.0;
		assertEquals ( expectedResult, actualResult, 0.0001);
		
	}
	
	@Test
	public void testSimpleMultiplication() {
		
		System.out.println("Test Multiply");
		actualResult = rpnCalculator.evaluate( "10 5 *" );
		expectedResult = 50.0;
		assertEquals ( expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate( "10 15 *" );
		expectedResult = 150.0;
		
		assertEquals ( expectedResult, actualResult, 0.0001);

	}
	
	@Test
	public void testSimpleDivision() {
		
		actualResult = rpnCalculator.evaluate( "10 5 /" );
		expectedResult = 2.0;
		assertEquals ( expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate( "100 10 /" );
		expectedResult = 10.0;
		
		assertEquals ( expectedResult, actualResult, 0.0001);

	}
	
	@Test
	public void testComplexRPNMathExpression() {
		
		actualResult = rpnCalculator.evaluate( "10 10 + 100 20 / * " );
		expectedResult = 100.0;
		assertEquals ( expectedResult, actualResult, 0.0001);

	}
	
}
