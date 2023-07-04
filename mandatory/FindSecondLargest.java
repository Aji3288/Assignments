package week3.day2.assignments.mandatory;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		Set<Integer> find = new TreeSet<Integer>(Arrays.asList(data));
		Arrays.sort(data );
		int len = data.length;
		System.out.println(data[len-2]);

	}

}
