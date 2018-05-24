package example.com.string;

public class StringClass {

	String str1 = "Amaresh";
	String str2 = "AMARESH";
	String str3 = "Amaresh";

	public String ToString() {
		return "Returning object of str";
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringClass str = new StringClass();
		if (str.str1 == str.str3) {
			System.out.println("Yes");
		}

	}

}
