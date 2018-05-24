package example.com.programs;

public class ComparingJavaStringObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="HelLo";
		String str2 =new String(str1);
		String str3="HelLo";
		String str4="HELLO";
		String str5="HELLO";

		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str1));
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		System.out.println(str4==str5);
	}

}
