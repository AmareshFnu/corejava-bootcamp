package example.com.nestedClass;

public class MemberOuterClass {

	/*
	 * There are basically three advantages of inner classes in java. They are as
	 * follows:
	 * 
	 * 1) Nested classes represent a special type of relationship that is it can
	 * access all the members (data members and methods) of outer class including
	 * private.
	 * 
	 * 2) Nested classes are used to develop more readable and maintainable code
	 * because it logically group classes and interfaces in one place only.
	 * 
	 * 3) Code Optimization: It requires less code to write.
	 */

	private int count = 10;

	public class MemberInnerClass {

		public void DisplayMessage() {

			System.out.println(count);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberOuterClass obj = new MemberOuterClass();

		MemberOuterClass.MemberInnerClass aaa = obj.new MemberInnerClass();
		aaa.DisplayMessage();

	}

}
