package week3.day2.assignment.men;

public class Palindrome {

	public static void main(String[] args) {
		String text = "madam";
		String text1= "";
		char[] ch = text.toCharArray();
		for (int i = text.length()-1; i>=0 ; i--) {
			
			text1 = text1 + text.charAt(i);
			
		}
			System.out.println(text1);	
			if(text.equals(text1)) {
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");	
			}
	}

}

