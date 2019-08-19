package com.amdocs;

import static org.junit.Assert.*;

import java.sql.Time;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class SavingsAccountTest {
	
	private SavingsAccount account;
	private SavingsAccount accountSpy; 
	
	@Before
	public void init() {
		account = new SavingsAccount();
		
		//partial mocking or spying
		accountSpy = spy( account);
	}
	
	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		
		//stubbing - hard coding the response of getBalance method 
		Mockito.doReturn( 5000.00 ).when( accountSpy ).getBalance();
		Mockito.doNothing().when( accountSpy ).updateBalanceIntoDB( anyDouble() );
		
		//Code under Test i.e we testing withdraw method
		double updateBalance = accountSpy.withdraw(1000.00);
		double expectedBalance = 4000.00;
		
		assertEquals( expectedBalance, updateBalance, 0.0001 );
		
		//check if getBalance method  was invoked exactly 1 time within withdraw method
		Mockito.verify(accountSpy, times(1) ).getBalance();
		
		//Check if UpdateBalanceIntoDB method was invoked exactly once within withdraw 
		Mockito.verify(accountSpy, times(1) ).updateBalanceIntoDB( anyDouble() );
		
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIsINsufficient() throws InsufficientBalanceException {
		
		boolean exceptionThrown = false;
		
		//stubbing - hard coding the response of getBalance method 
		Mockito.doReturn( 500.00 ).when( accountSpy ).getBalance();
		Mockito.doNothing().when( accountSpy ).updateBalanceIntoDB( anyDouble() );
		
		try {			
			accountSpy.withdraw(10000.00);
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		
		boolean expectedResponse = true;
		assertEquals(expectedResponse, exceptionThrown);
		
		//check if getBalance method  was invoked exactly 1 time within withdraw method
		Mockito.verify(accountSpy, times(1) ).getBalance();
		
		//Check if UpdateBalanceIntoDB method was never invoked within withdraw 
		Mockito.verify(accountSpy, times(1) ).updateBalanceIntoDB( anyDouble() );
		
	}

}
