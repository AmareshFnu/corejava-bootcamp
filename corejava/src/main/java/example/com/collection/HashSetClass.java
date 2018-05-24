package example.com.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashSet stores the elements by using a mechanism called hashing. HashSet
		 * contains unique elements only. List can contain duplicate elements whereas
		 * Set contains unique elements only.
		 * 
		 * 
		 */

		Set<String> set = new HashSet<String>();
		set.add("Amaresh");
		set.add("Bheemesh");
		set.add("bheemesh");
		set.add("Bheemesh");

		System.out.println(set);

		set.forEach(System.out::println);
		
//		
//		for (String string : set) {
//
//			System.out.println(string);
//
//		}
//
//		Iterator<String> itr = set.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//
//		}
//
//		Enumeration<String> en = Collections.enumeration(set);
//
//		while (en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//
//		}

	}

}
