package week3.day2.assignment.men;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		int length = text1.length();
		int length2 = text2.length();
		char[] ch1 = text1.toCharArray();
		char[] ch2 = text2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");

		} else {
			System.out.println("Not Anagram");
		}

	}

	}


