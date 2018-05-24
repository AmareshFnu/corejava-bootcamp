package example.com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortExample {

	public static void main(String args[]) {
		// Creating new ArrayList object
		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to the list
		al.add("Element1");
		al.add("Element3");
		al.add("Element2");
		al.add("Element4");

		System.out.println("******Before sorting******");
		for (String elements : al)
			System.out.println(elements);
		{

			// Sort - Ascending Order
			Collections.sort(al);

			// collection Descending order

		}

		System.out.println("******After sorting in Ascending Order******");

		// Sort Descending order

		for (String elements : al) {
			System.out.println(elements);
		}

		Collections.sort(al, Collections.reverseOrder());

		System.out.println("******After Sorting in Descending order******");

		for (String elements : al) {
			System.out.println(elements);
		}
	}

}