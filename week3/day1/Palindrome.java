package week3.day1;

public class Palindrome {

	public static void main(String[] args) 
	{
		String input = "madam";
		String reverse ="";
		char[] charArray = input.toCharArray();
		
		for (int i=charArray.length-1; i>=0; i--)
		{
			reverse = reverse + input.charAt(i);
			System.out.println(reverse);
		}

		
		if (reverse.equalsIgnoreCase(input))
		{
			System.out.println("The given string " + input + "is a palindrome");
		}
		else
		{
			System.out.println("The given string " + input + " is not a palindrome");
		}

	}

}
