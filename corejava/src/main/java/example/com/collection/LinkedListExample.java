package example.com.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// Creating list of Books

		/*
		 * ArrayList LinkedList 1) ArrayList internally uses dynamic array to store the
		 * elements. LinkedList internally uses doubly linked list to store the
		 * elements. 2) Manipulation with ArrayList is slow because it internally uses
		 * array. If any element is removed from the array, all the bits are shifted in
		 * memory. Manipulation with LinkedList is faster than ArrayList because it uses
		 * doubly linked list so no bit shifting is required in memory. 3) ArrayList
		 * class can act as a list only because it implements List only. LinkedList
		 * class can act as a list and queue both because it implements List and Deque
		 * interfaces. 4) ArrayList is better for storing and accessing data. LinkedList
		 * is better for manipulating data.
		 */

		List<Book> list = new LinkedList<Book>();

		// Creating Books
		Book b1 = new Book(101, "C", "C author", "A++", 1);
		Book b2 = new Book(102, "B", "B Author", "B++", 2);
		Book b3 = new Book(103, "D", "D Author", "C++", 3);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}