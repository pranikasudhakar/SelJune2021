package week3.day1;

public class Calculator {

	public void add(int num1, int num2)
	{
		System.out.println("Addition of 2 number is: " + (num1+num2));
	}
	public void add(int num1, int num2, int num3)
	{
		System.out.println("Addition of 3 number is: " + (num1+num2+num3));
	}
	
	public void multiply(int num1, int num2)
	{
		System.out.println("Multiplication of 2 number is: " + (num1*num2));
	}
	
	public void multiply(int num1, double num2)
	{
		System.out.println("Multiplication of a number and double is: " + (num1*num2));
	}
	
	public void subtract(int num1, int num2)
	{
		System.out.println("Subtraction of 2 number is: " + (num1-num2));
	}

	public void subtract(double num1, double num2)
	{
		System.out.println("Subtraction of double is: " + (num1-num2));
	}
	
	public void divide(int num1, double num2)
	{
		System.out.println("Subtraction of 2 number is: " + (num1/num2));
	}

	public static void main(String[] arg)
	{
		Calculator calc = new Calculator();
		calc.add(2, 4);
		calc.add(2, 4, 6);
		calc.multiply(2, 4);
		calc.multiply(6, 4.2);
		calc.subtract(4.5, 2.5);
		calc.subtract(8, 2);
		calc.divide(10, 5.0);
	}
}
