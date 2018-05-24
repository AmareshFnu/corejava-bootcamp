package example.com.programs2;

import java.util.Scanner;

public class PrimeNumberRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to find Prime or Not");

		int number = scan.nextInt();
		int PrimeNumber = primeNumber(number, number / 2);

		if (PrimeNumber == 1) {
			System.out.println("Prime Number!!!!");

		} else
			System.out.println("Not a prime number!!!!");

	}

	private static int primeNumber(int number, int i) {

		if (i == 1) {
			return 1;
		} else if (number % i == 0) {
			return 0;
		} else
			return primeNumber(number, i - 1);
	}

}
