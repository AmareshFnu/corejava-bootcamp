package example.com.programs2;

import java.util.Scanner;

public class FactorialNumberRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number to find the factorial..!");
		int number = scan.nextInt();

		fact = factorial(number);
		System.out.println("Factorial of Given number: " + number + "!");
		System.out.println("Result:" + fact);

	}

	private static int factorial(int n) {

		if (n == 0) {
			return 1;
		} else
			return (n * (factorial(n - 1)));
	}

}
