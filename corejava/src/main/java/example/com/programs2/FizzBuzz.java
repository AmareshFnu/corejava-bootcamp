package example.com.programs2;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Print multiples of 3 as Fizz 2. Print multiples of 5 as Buzz 3. Print fizz
		 * buzz for mulitples of 3 and 5
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter numbers to print fizz ,buzz and fizz buzz");

		int numbers = scan.nextInt();

		for (int i = 1; i < numbers; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			}

			else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");

			} else {
				System.out.println(i);
			}
		}
	}

}
