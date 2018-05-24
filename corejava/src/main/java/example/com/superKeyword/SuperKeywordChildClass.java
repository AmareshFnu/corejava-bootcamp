package example.com.superKeyword;

public class SuperKeywordChildClass extends SuperKeywordParentClass {

	protected SuperKeywordChildClass() {
		super();
		super.getA();
		// TODO Auto-generated constructor stub

		/*
		 * super can be used to refer immediate parent class instance variable. super
		 * Its useful when parent class and subclass instance variable name is same/identical
		 * can be used to invoke immediate parent class method. super() can be used to
		 * Its useful when method is overriden in the child class using super we can call parent class method
		 * invoke immediate parent class constructor.
		 */

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordChildClass superkeyword = new SuperKeywordChildClass();
	}

}
