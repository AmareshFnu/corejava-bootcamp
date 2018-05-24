package example.com.programs2;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number to find if its perfect number of not");

		int number = scan.nextInt();
		int temp = 0;

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp = temp + i;
			}
		}
		if (temp == number)
			System.out.println("Yes...! given number:" + number + " is a Perfect number");
		else
			System.out.println("No...! given number:" + number + " is Not a Perfect number");
	}

}
