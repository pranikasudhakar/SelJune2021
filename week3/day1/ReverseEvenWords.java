package week3.day1;


public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		String text = "I am a software tester";
		
		int i=0, reverse=0;
		
		String[] arrayOfString = text.split(" ");
		
		/*
		 * for (String a : arrayOfString) { System.out.println(a); }
		 * 
		 * System.out.println(arrayOfString.length);
		 */
		for (i = 1 ; i <= arrayOfString.length; i++)
		{
			if (i%2 == 0) 
			{ 
				for (int j = arrayOfString.length -1 ; j >=0; j--) 
				{
					System.out.print(arrayOfString[i]);
				} 
				
			}
		}
	}
}
