package week3.day2.classroom;

import java.util.LinkedList;
import java.util.List;


public class MoveAllZeroToRight {

	public static void main(String[] args) 
	{
		int[] num = { 4, 0, 3, 0, 1, 5, 2, 0 };
		List<Integer> ZeroValues = new LinkedList<Integer>();
		List<Integer> nonZeroValues = new LinkedList<Integer>();
		for (int i = 0; i < num.length; i++) {

			if (num[i] == 0) {
				ZeroValues.add(num[i]);
			} else
				nonZeroValues.add(num[i]);

		}
		ZeroValues.addAll(nonZeroValues);
		System.out.println(ZeroValues);

	}

}
