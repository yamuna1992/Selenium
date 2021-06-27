package Week3.Day1;

public class Assig1_Palindrome {

	public static void main(String[] args) {
		String chr = "madam";
		String reverse = "";
		int len = chr.length();

		for (int i = len - 1; i > -1; i--) {
			reverse = reverse + chr.charAt(i);
		}
		System.out.println("Reversed String is: " + reverse);

		if (chr.equals(reverse)) {
			System.out.println("The Given String is Palindrome");
		} else {
			System.out.println("The Given String is not a Palindrome");
		}
	}
}