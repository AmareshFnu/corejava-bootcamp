package example.com.defaultconstructor;

public class DefaultConstructor {

	int a;
	long b;
	short c;
	float d;
	double e;
	String str;
	char ch;
	boolean bool;

	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
		dc.print();

	}

	private void print() {
		// TODO Auto-generated method stub

		System.out.println("Default value of int :::::" + a);
		System.out.println("Default value of long :::::" + b);
		System.out.println("Default value short :::::" + c);
		System.out.println("Default value of float :::::" + d);
		System.out.println("Default value of double :::::" + e);
		System.out.println("Default value of string :::::" + str);
		System.out.println("Default value of char :::::" + ch);
		System.out.println("Default value of boolean :::::" + bool);
	}

}
