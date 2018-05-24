package example.com.programs;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<Integer>();

		li.add(56);
		li.add(2);
		li.add(100);
		li.add(8);
		li.add(65);
		li.add(180);
		int firstMaxNumber = 0;
		int secondMaxNumber = 0;

		for (Integer integer : li) {
			if (firstMaxNumber < integer) {

				secondMaxNumber = firstMaxNumber;
				firstMaxNumber = integer;

			} else if (secondMaxNumber < integer) {
				secondMaxNumber = integer;
			}

		}
		
		System.out.println("FirstMax number::::::"+firstMaxNumber);
		System.out.println("second number::::::"+secondMaxNumber);

	}

}
