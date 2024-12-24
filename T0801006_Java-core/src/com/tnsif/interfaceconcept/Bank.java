package com.tnsif.interfaceconcept;



public interface Bank {

	double MIN_BALANCE = 1000;
	double DEPOSIT_LIMIT = 25000;
	double INTEREST_RATE = 7.8;
	
	void withdraw(Account a, float amt);
	void deposit(Account a, float amt);
}
