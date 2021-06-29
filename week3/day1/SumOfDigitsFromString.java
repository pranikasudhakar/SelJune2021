package week3.day1;

public class SumOfDigitsFromString {

	public static void main(String[] args) 
	{
		String text = "Tes12Le79af65";
		int sumofdigit = 0;
		String numbers = text.replaceAll("[A-Za-z]", "");
		char[] split = numbers.toCharArray();
		
		for (int i=0; i<split.length; i++)
		{
		
		int convertToNumeric = Character.getNumericValue(split[i]);
		sumofdigit = sumofdigit + convertToNumeric;
		}
		System.out.println("Sum of Digits from String is: "+ sumofdigit);
		
	}

}
