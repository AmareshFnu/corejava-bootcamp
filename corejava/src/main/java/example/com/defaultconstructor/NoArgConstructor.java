package example.com.defaultconstructor;

public class NoArgConstructor {

	int a;
	long b;
	short c;
	float d;
	double e;
	String str;
	char ch;
	boolean bool;

	public  NoArgConstructor() {
		float f = 10;
		// NoArgConstructor nac = new NoArgConstructor(); you will get stack overflow
		// error
		System.out.println("Default value of float inside No argument constructor :::::" + f);
		// nac.printf(f);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoArgConstructor nac = new NoArgConstructor();
		nac.print();

	}

	synchronized void print() {
		// TODO Auto-generated method stub
		
		final int aaa ;

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
