package example.com.string;

public class StringToCharAndWiseVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char chr = 'A';

		char[] chrArray = { 'a', 'm', 'r', 'e' };

		// converting character to string in two ways

		// 1.Using character class
		// 2.Using String class

		String str1 = Character.toString(chr);
		String str2 = String.valueOf(chr);

		String strArray = String.valueOf(chrArray);

		System.out.println(strArray);

		String[] strArray1 = new String[10];
		strArray1[0] = "amaresh";
		strArray1[1] = "amaresh";
		strArray1[2] = "amaresh";
		strArray1[3] = "amaresh";
		strArray1[4] = "amaresh";

		for (int i = 0; i < strArray1.length; i++) {
			System.out.println(strArray1[i]);
		}
	}

}
