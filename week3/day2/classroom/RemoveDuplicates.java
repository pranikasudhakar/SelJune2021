package week3.day2.classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public void removeDuplicates(String input)
	
	{
		
		
		char[] convertToCharArray = input.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (int i=0; i < convertToCharArray.length - 1; i++)
			{
				if (!(Character.isWhitespace(convertToCharArray[i])));
				{
					if (!charSet.add(convertToCharArray[i]))
					{
						continue;
					}
					else
					{
						dupCharSet.add(convertToCharArray[i]);
					}
				}
			}
		
		System.out.println("Unique Characters: " + charSet);
		//System.out.println("Duplicate Characters: " + dupCharSet);
	}
	
	public static void main(String[] args) {
		RemoveDuplicates dup = new RemoveDuplicates();
		dup.removeDuplicates("PayPal India");
	}
	
	

}
