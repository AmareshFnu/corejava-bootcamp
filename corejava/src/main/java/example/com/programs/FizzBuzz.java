/**
 * 
 */
package example.com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author amaresh
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> naturalNumber = new ArrayList<Integer>();

		for (int i = 1; i < 16; i++) {
			naturalNumber.add(i);
		}

		/* My Approach */
		/*
		 * int naturalNumber1 = 15;
		 * 
		 * for (int i = 1; i <=100; i++) {
		 * 
		 * for (int j = 1; j < 100; j++) {
		 * 
		 * if (i == (3 * 5) && i == (5 * 3)) { System.out.println("The given number" + i
		 * + "********FizzBuzz**********"); break; } else if (i == (3 * j)) {
		 * System.out.println("The given number" + i + "********Fizz**********"); } else
		 * if (i == (5 * j)) { System.out.println("The given number" + i +
		 * "********Buzz**********"); }
		 * 
		 * }
		 * 
		 * }
		 */

		/* from internet */
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number");

		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println("FizzBuzz");
			else
				System.out.println(i);
		}

	}

}
