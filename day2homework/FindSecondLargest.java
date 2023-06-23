package week1.day2homework;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] num = {23,45,67,32,89,22};
		
		Arrays.sort(num);
		int len = num.length;
		System.out.println(num[len-2]);

	}

}
