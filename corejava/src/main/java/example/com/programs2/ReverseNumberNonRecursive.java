package example.com.programs2;

import java.util.Scanner;

public class ReverseNumberNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to reverse");

		int number = scan.nextInt();
		StringBuffer sb = new StringBuffer();
		int reverse = 0;
		int sum = 0;
		int temp = number;

		while (number > 0) {

			reverse = number % 10;

			// sb.append(reverse);
			sum = (sum * 10) + reverse;

			number = number / 10;

		}
		System.out.println("Reverse of the number is : " + sum);
		if (temp == sum)
			System.out.println("Given number: " + temp + " is a palindrome");
		else
			System.out.println("Given number: " + temp + " is not a palindrome");
	}

}
