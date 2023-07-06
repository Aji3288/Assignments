package week3.day2.assignment.men;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch= test.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			char cc = test.charAt(i);		
			if(i%2!=1) {
				System.out.print(Character. toUpperCase(cc));
			}
			else 
			{
				System.out.print(ch[i]);
			}
			}
		
}}

		
		
		

	


