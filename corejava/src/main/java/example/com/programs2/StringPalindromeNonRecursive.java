package example.com.programs2;

import java.util.Scanner;

public class StringPalindromeNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter string to check if its palindrome or not...");
		String str = scan.next();

		StringBuffer sb = new StringBuffer();
		char[] chr = str.toCharArray();

		for (int i = chr.length - 1; i >= 0; i--) {

			sb.append(chr[i]);

		}

		if (str.equalsIgnoreCase(sb.toString()))
			System.out.println("Given string: " + str + " is a palindrome !!!");
		else
			System.out.println("Given string: " + str + " is Not a palindrome !!!");

	}

}
