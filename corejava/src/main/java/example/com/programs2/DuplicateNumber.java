package example.com.programs2;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int maxLength = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i <= maxLength; i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter the number to the arraylist with one duplicate number");

			list.add(scan1.nextInt());
		}

		/* Find the sum of the numbers in arrayList */
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);

		}

		/* hieghest number of the list */
		int heighestNumber = list.size();
		
		
			int duplicateNumber=sum-(heighestNumber*(heighestNumber-1)/2);
		
		

		System.out.println("Duplicate Number is:  "+duplicateNumber);
	}

}
