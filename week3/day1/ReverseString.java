package week3.day1;

public class ReverseString {

	public static void main(String[] args) 
	{
		String test = "feeling good";
		char[] convertToCharArray = test.toCharArray();
		
		
		
		for (int i = convertToCharArray.length - 1; i >= 0 ; i--)
		{
			System.out.print(convertToCharArray[i]);
		}
			
	}

}
