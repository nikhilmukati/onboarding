package com.amdocs;

import javax.naming.InsufficientResourcesException;

public class SavingsAccount {

	public double getBalance() {
		System.out.println("Assume balance is retrived from Database");
		return 7000.00;
	}
	
	public double withdraw( double amountToBeWithdrawn ) throws InsufficientBalanceException {
		System.out.println("Inside Withdraw Method ");
		
		double currentBalanace = getBalance();
		
		if ( amountToBeWithdrawn < currentBalanace ) {
			currentBalanace = currentBalanace - amountToBeWithdrawn;
		}
		else 
			throw new InsufficientBalanceException();
			
		updateBalanceIntoDB( currentBalanace );
		
		return currentBalanace;
				
	}
	
	public void updateBalanceIntoDB( double currentBalance ) {
		
		System.out.println("Assume here balance is updated into database ");

	}
	
}
