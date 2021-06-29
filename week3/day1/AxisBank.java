package week3.day1;

public class AxisBank extends BankInfo
{

	public void deposit()
	{
		System.out.println("Axis Bank Deposit Account");
	}
	
	public static void main(String[] args) 
	{
		AxisBank abank = new AxisBank();
		abank.deposit();
		abank.fixed();
		abank.saving();

	}

}
