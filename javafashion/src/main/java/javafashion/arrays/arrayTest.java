package javafashion.arrays;

import java.util.Arrays;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char student[] = new char[10];

		student[0] = 'A';
		student[1] = 'E';
		student[2] = 'D';
		student[3] = 'C';
		student[4] = 'B';

		Arrays.sort(student);

		for (char string : student) {
			System.out.println(string);
		}

		String emp[] = { "Amaresh", "Angadi", "Chethan", "Bhim", "Rudresh" };

		Arrays.sort(emp);

		for (String string : emp) {
			System.out.println(string);

		}

		Integer inta = new Integer(1);

		inta.toString();
		System.out.println(inta);
	}

}
