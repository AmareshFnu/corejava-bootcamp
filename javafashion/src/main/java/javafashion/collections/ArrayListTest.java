package javafashion.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("India");

		Vector<String> studentVector = new Vector<String>();
		studentVector.add("USA"); // Vector is synchronized by default

		Collections.synchronizedList(studentList);

	}

}
