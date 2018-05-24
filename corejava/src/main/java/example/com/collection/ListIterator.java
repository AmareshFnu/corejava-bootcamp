package example.com.collection;

import java.util.LinkedList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new LinkedList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
		

		java.util.ListIterator<String> ltr = names.listIterator(names.size());
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}

}
