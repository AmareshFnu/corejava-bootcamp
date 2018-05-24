package example.com.programs2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Enter String to find duplicate character...!, Give at least one duplicate character in string sequence");

		String str = scan.next();
		StringBuffer sb = new StringBuffer();
		char[] chr = str.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < chr.length; i++) {
			if (list.contains(chr[i])) {
				sb.append(chr[i]);

			} else {
				list.add(chr[i]);
			}
		}
		System.out.println("Duplicate characters are as below: ");
		System.out.println(sb);
	}

}
