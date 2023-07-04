package week3.day2.assignments.mandatory;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		char[] charArray = text.toCharArray();
		Set<Character> text1 = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			text1.add(charArray[i]);
		}
		System.out.println(text1);
	}

}


