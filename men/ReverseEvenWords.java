package week3.day2.assignment.men;



public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		String test1 = "";
		for (int i = 0; i < split.length; i++) {
			if(i%2==0) {
				test1= split[i];
				System.out.print(test1 + " ");
			}
			else 
			{
				String s = " ";
				for (int j = split[i].length()-1; j >=0 ; j--)				
				{
					String s1 = split[i];
					s=s+s1.charAt(j);
				
				}
				System.out.print(s + " ");
			}
		}
		
		
}
}


