package org.system;

public class BankInfo {
	
	public void saving(int accno, double amount) 
	{
		System.out.println("Amount in the account " +accno + " is: " + amount);
		
	}

	public void fixed(int accno, String name, double amount)
	{
		System.out.println("Amount in the account " +accno + " is: " + amount);
		
	}
	
	public void deposit(double amount)
	{
		System.out.println("Deposit - The Amount is " + amount);
	}
}
