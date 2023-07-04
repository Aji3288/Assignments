package week3.day2.assignments.mandatory;


import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {

	public static void main(String[] args) {
		Integer []num = {3,2,11,4,6,7};
		Integer []nums = {1,2,8,4,9,7};		
		Set<Integer> sets = new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) 
		{
		for (int j = 0; j < nums.length; j++)
		{
			if(num[i]==nums[j]) 
			{
				System.out.println(num[i]);
			}
		}
	}
	}
}


	
	


