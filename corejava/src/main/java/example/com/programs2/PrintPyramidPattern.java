package example.com.programs2;

import java.util.Scanner;

public class PrintPyramidPattern {

	public static void main(String[] args) {

		/*
		 * *
		 **
		 ***
		 ****
		 ******/

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the count to print pyramid structure");

		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
