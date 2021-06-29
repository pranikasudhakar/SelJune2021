package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		String text = "I am a software tester";
		
		int i=0;
		String[] arrayOfString = text.split(" ");
		
		for (String a : arrayOfString)
		{
			System.out.println(a);
		}
		
		System.out.println(arrayOfString.length);
		
		for (i = 0 ; i < arrayOfString.length; i++)
		{
			int b = text.indexOf("arrayOfString");
			System.out.println(b);
			/*
			 * if (a%2 == 0) { for (int j = a.length -1 ; j >=0; i--) {
			 * 
			 * } }
			 */
		
		}
	}


}
