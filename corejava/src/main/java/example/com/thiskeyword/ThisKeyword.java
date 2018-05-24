/**
 * 
 */
package example.com.thiskeyword;

/**
 * @author amaresh
 *
 */
public class ThisKeyword {

	int a;
	int b;
	int c;

	/**
	 * 
	 */

	public ThisKeyword() {
		this(20, 30);
		
	}

	public ThisKeyword(int a, int b) {
		// TODO Auto-generated constructor stub
		this(20,40,50);
		/*
		 * a = a; b = b;
		 * 
		 * this assingment has no affect since both instance variable and local variable
		 * has the same name.hence compiler will get confused hence it wont assing the
		 * values.In order avoid such a confusion its better to use This keyword.
		 */

		/*
		 * using this keyword 1. this keyword is used to refer the current class
		 * instance variable. 2.This is used to differentiate between the local and
		 * instance variable 3. The this is used to call overloaded constructor in java
		 * 4.This keyword can be used to call the current class method. 5.this is used
		 * to return current Object
		 */
		this.a = a;
		this.b = b;

	}
	
	public ThisKeyword(int a, int b,int c) {
		// TODO Auto-generated constructor stub

		/*
		 * a = a; b = b;
		 * 
		 * this assingment has no affect since both instance variable and local variable
		 * has the same name.hence compiler will get confused hence it wont assing the
		 * values.In order avoid such a confusion its better to use This keyword.
		 */

		/*
		 * using this keyword 1. this keyword is used to refer the current class
		 * instance variable. 2.This is used to differentiate between the local and
		 * instance variable 3. The this is used to call overloaded constructor in java
		 * 4.This keyword can be used to call the current class method. 5.this is used
		 * to return current Object
		 */
		this.a = a;
		this.b = b;
		this.c =c;

	}
	
	public void ThisKeyword1(int a, int b,int c) {
		// TODO Auto-generated constructor stub

		/*
		 * a = a; b = b;
		 * 
		 * this assingment has no affect since both instance variable and local variable
		 * has the same name.hence compiler will get confused hence it wont assing the
		 * values.In order avoid such a confusion its better to use This keyword.
		 */

		/*
		 * using this keyword 1. this keyword is used to refer the current class
		 * instance variable. 2.This is used to differentiate between the local and
		 * instance variable 3. The this is used to call overloaded constructor in java
		 * 4.This keyword can be used to call the current class method. 5.this is used
		 * to return current Object
		 */
		this.a = a;
		this.b = b;
		this.c =c;

	}

	public void print() {
		System.out.println(a);
		System.out.println(b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj1 = new ThisKeyword();
		ThisKeyword obj = new ThisKeyword(20, 30);
		obj.print();
		ThisKeyword a = obj.dispay("hellow");
		a.print();

	}

	public ThisKeyword dispay(String s) {
		System.out.println("printing" + s);

		return this;
	}

}
