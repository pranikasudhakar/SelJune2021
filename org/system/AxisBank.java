package org.system;

public class AxisBank extends BankInfo {

	public void deposit(double amount) 
	{
			System.out.println("Override mthod Deposit - The Amount is " + amount);
	}

	public static void main(String[] args) 
	{
		AxisBank axis = new AxisBank();
		axis.deposit(1000.23);
		axis.saving(10234, 15000.23);
		axis.fixed(9999, "TestLeaf", 100001.01);
		axis.deposit(85.21);
	}
	
}
