package week3.day1;

public class CharOccurence {

	public static void main(String[] args) 
	{

		// Check number of occurrences of a char (eg 'e') in a String
		
		String text = "welcome to chennai";
		int length = text.length();
		
		//System.out.println(length);
		
		String removalOfValueSpaceAndE = text.replaceAll("[e]", "");
		int removedlength = removalOfValueSpaceAndE.length();
		
		//System.out.println(removedlength);
		System.out.println("Count of e in the given text is: " + (length - removedlength));
		
	}

}
