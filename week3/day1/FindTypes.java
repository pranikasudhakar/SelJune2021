package week3.day1;

public class FindTypes {

	public static void main(String[] args) 
	{
		// Here is the input
		String text = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] split = text.toCharArray();
		System.out.println(text.length());
		
		for (int i=0; i < text.length(); i++)
		{
			char c = split[i];
			if ( Character.isLetter(c) ) 
			{
				letter++;
				
			}
			
			else if (Character.isDigit(c))
			{
				num++;
			}
			
			else if (Character.isSpaceChar(c))
			{
				space++;
			}
			
			else
			{
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("Number" + num);
		System.out.println("Space" + space);
		System.out.println("SpecialCharacter" + specialChar);
	}

}
