package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testSayHello() {
		
		Hello hello = new Hello();
		String expectedResponce = "Hello Maven!";
		String actualResponce = hello.sayHello();
		assertEquals( expectedResponce, actualResponce );
	}
}
