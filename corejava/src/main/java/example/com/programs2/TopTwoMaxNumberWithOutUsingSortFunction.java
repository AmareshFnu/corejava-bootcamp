package example.com.programs2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TopTwoMaxNumberWithOutUsingSortFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int size = scan.nextInt();

		int maxOne = 0;
		int maxTwo = 0;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= size; i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter integer values to arrayList");
			list.add(scan1.nextInt());

		}

		for (Integer integer : list) {
			if (maxOne < integer) {
				maxTwo = maxOne;
				maxOne = integer;

			} else if (maxTwo < integer) {
				maxTwo = integer;
			}
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);
	}

}
