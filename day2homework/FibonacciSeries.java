package week1.day2homework;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range =8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		for (int i = 1; i < range; i++) {
			int sum = firstNum + secNum;
			firstNum = secNum;
			secNum=sum;
			System.out.println(sum);
		}
				

	}

}
