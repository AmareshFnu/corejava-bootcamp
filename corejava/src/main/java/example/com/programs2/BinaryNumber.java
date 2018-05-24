package example.com.programs2;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find if its binary number or not");

		long temp = 0;

		long number = scan.nextLong();
		long counter = number;

		boolean isBinary = false;

		while (number > 0) {
			temp = number % 10;
			if (temp > 1) {
				isBinary = false;
				break;
			} else {
				isBinary = true;
			}
			number = number / 10;
		}
		if (isBinary) {
			System.out.println("The given number " + counter + " is a Binary number");

		} else {
			System.out.println("The given number " + counter + " is not a Binary number");
		}
	}

}
