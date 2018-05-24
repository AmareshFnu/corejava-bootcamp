package example.com.programs2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int size = scan.nextInt();
		int temp = 0;
		System.out.println("Enter elements to array");

		Scanner scan1 = new Scanner(System.in);

		int array[] = new int[size];

		for (int i = 0; i < size; i++) {

			array[i] = scan1.nextInt();

		}
		System.out.println("array before sorting ");
		for (int i : array) {
			System.out.println(i);
		}

		/* Sort given array using Bubble sort */

		for (int i = 0; i < array.length; i++) {

			for (int j = 1; j < array.length - 1; j++) {

				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;

				}

			}

		}
		System.out.println("Array after sorting");
		for (int i : array) {
			System.out.println(i);

		}
	}

}
