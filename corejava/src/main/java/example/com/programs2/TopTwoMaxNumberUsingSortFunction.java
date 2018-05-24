package example.com.programs2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TopTwoMaxNumberUsingSortFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int size = scan.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= size; i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter integer values to arrayList");
			list.add(scan1.nextInt());

		}
		/*
		 * Sort arrayList using in-build sorting function available in collection
		 * framework
		 */
		Collections.sort(list);

		System.out.println("Sorted list:");
		System.out.println(list);

		System.out.println("Top 1st Max number: " + list.get(list.size() - 1));
		System.out.println("Top 2nd Max number: " + list.get(list.size() - 2));

	}

}
