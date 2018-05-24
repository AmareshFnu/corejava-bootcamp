package example.com.programs2;

import java.util.Scanner;

public class ReverseNumberRecursive {
	int temp = 0;
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to check if its palindrome or not");

		int number = scan.nextInt();

		System.out.println(reverseNumber(number));
		reverseMethod(number);
	}

	public static int reverseNumber(int number) {

		while (number == 0) {
			return sum;
		}
		int revrese = number % 10;
		sum = (sum * 10) + revrese;
		number = number / 10;

		return reverseNumber(number);

	}

	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			// Method is calling itself: recursion
			reverseMethod(number / 10);
		}
	}

}
