package example.com.programs2;

import java.util.Scanner;

public class FactorialNumberNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to find the factorial..!");
		int givenNumber = scan.nextInt();

		for (int i = 1; i <= givenNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of Given number: " + givenNumber + "!");
		System.out.println("Result:" + fact);

	}
}
