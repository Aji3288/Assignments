package week1.day2homework;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int num =-40;
		if(num<0)
		{
			num = num*-1;
		
			System.out.println("The number -40 is converted to 40");
		}
		else
			System.out.println(num);
	}

}
