package example.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class WaysToLoopAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			al.add("Bangalore_" + i);

		}

		/* Different ways to loop through an array list */

		/* 1. using for loop */
		System.out.println("************Using for loop*****************");
		long startTime = System.currentTimeMillis();
		// System.out.println("current system time"+startTime);
		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));

		}
		System.out.println("Time taken by for loop: " + (System.currentTimeMillis() - startTime) + "ms");

		/* 2. using for each loop */

		System.out.println("************Using for each loop*****************");
		startTime = System.currentTimeMillis();
		for (String string : al) {
			System.out.println(string);
		}
		System.out.println("Time taken by for each loop: " + (System.currentTimeMillis() - startTime) + "ms");

		/* 3. using while loop */

		int count = 0;
		System.out.println("************Using while with condition*****************");
		startTime = System.currentTimeMillis();
		while (count < al.size()) {

			System.out.println(al.get(count));
			count++;
		}

		System.out.println("Time taken by while condition: " + (System.currentTimeMillis() - startTime) + "ms");

		Iterator<String> it = al.iterator();
		System.out.println("************Using Iterator*****************");
		startTime = System.currentTimeMillis();
		while (it.hasNext()) {
			// type type = (type) it.next();

			System.out.println(it.next());

		}
		System.out.println("Time taken by while iterator: " + (System.currentTimeMillis() - startTime) + "ms");

		ListIterator<String> litr = al.listIterator(al.size());
		System.out.println("************Using ListIterator*****************");
		startTime = System.currentTimeMillis();

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());

		}
		System.out.println("Time taken by while ListIterator: " + (System.currentTimeMillis() - startTime) + "ms");

		Enumeration<String> en = Collections.enumeration(al);
		System.out.println("************Using enumeration*****************");
		startTime = System.currentTimeMillis();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());

		}
		System.out.println("Time taken by enumeration: " + (System.currentTimeMillis() - startTime) + "ms");

	}

}
