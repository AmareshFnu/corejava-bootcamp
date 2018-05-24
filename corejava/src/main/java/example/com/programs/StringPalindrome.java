package example.com.programs;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palindrome = "Wow";
		StringBuffer strbuilder = new StringBuffer();

		for (int i = palindrome.length() - 1; i >= 0; i--) {
			strbuilder = strbuilder.append(palindrome.charAt(i));

		}

		System.out.println(strbuilder);

		if (palindrome.equalsIgnoreCase(strbuilder.toString())) {

			System.out.println("Yeahhhhhh, Its palindrome:::::::::");

		} else
			System.out.println("Sorry, given string is not a palindrom:::::::::::");

	}

}
