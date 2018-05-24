package example.com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "suresh");
		map.put(2, "Bheemesh");
		map.put(5, "Amaresh");
		map.put(4, "Nagesh");
		map.put(3, "Naresh");

		/*
		 * 1. Its basically key value pair. 2.It accepts one null key and N number of
		 * null values. 3. Key should be unique where as values can be duplicate 4.It
		 * uses map interface
		 */

		Collection<String> m1 = map.values();

		Set<Integer> keySet = map.keySet();
		// System.out.println(keySet);

		// System.out.println(m1);

		Set<Entry<Integer, String>> a = map.entrySet();

		System.out.println(map);

		for (Entry<Integer, String> b : map.entrySet()) {
			System.out.println(b.getKey() + " " + b.getValue());
		}
	}
}
