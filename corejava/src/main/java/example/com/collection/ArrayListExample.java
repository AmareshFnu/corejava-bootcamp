package example.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Raichur");
		list.add("Bangalore");
		list.add("Sirwar");
		list.add("Devadurga");

		List<String> list2 = new ArrayList<String>();
		list.add("Raichur");
		list.add("Bangalore");
		list.add("Sirwar");
		list.add("Devadurga");

		Iterator<String> itr = list.iterator();

		List<String> list3 = new ArrayList<String>();
		list3.addAll(list);
		list3.addAll(list2);

		Iterator<String> itr1 = list3.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());

			/*
			 * java.util.ConcurrentModificationException list3.clear();
			 */

		}

	}

}
