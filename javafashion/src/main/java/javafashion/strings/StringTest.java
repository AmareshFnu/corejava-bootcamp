package javafashion.strings;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "A";
		System.out.println(str.hashCode());

		str = str.concat("B");

		System.out.println(str);
		System.out.println(str.hashCode());
	}

}
