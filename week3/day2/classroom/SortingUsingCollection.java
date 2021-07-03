package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection 
{

	public static void main(String[] args) 
	{

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		int inputlength = input.length;
		
		List<String> values = new ArrayList<String>();
		
		int i = 0;
		
		for (i=0 ; i <inputlength ; i++)
		{
			values.add(input[i]);
		}
		
		Collections.sort(values);
		
		
		for (i = inputlength-1; i >= 0; i--)
		{
			System.out.println(values.get(i));
		}
		
		
	}

}
