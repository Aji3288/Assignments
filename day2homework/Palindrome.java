package week1.day2homework;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int revNum = 0;
		int temp = 0;
		while(num >0) 
		{
			temp = num%10;
			revNum = (revNum*10)+temp;
			num = num/10;
			} 
		if(num == revNum)
		{
			System.out.println("Palindrome Number");
			
			}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}
}
		
	
	


