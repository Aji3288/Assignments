package week3.day2.assignment.men;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
        String[] text1 = text.split(" ");
        for (int i = 0; i < text1.length; i++) {
            String text2 = text1[i];
            int  count =0;
            for (int j = 0; j < i; j++) {
                if (text1[j].equals(text2)) {
                   count++;
                }
            }
            if (count==0) {
                System.out.print(text2 + " ");
            }
        }
	}
}
