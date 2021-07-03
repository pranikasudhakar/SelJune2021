package week3.day2.classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateUsingCollection {

	public static void main(String[] args) {
		
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		
		Set<Integer> originalValue = new LinkedHashSet<Integer>();
		Set<Integer> duplicateValue = new LinkedHashSet<Integer>();
		
		for (Integer dups : data)
		{
			if (!originalValue.add(dups))
				duplicateValue.add(dups);
		}
		
		System.out.println(duplicateValue);
	}

}
