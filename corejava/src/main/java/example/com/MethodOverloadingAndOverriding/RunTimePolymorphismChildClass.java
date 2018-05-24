package example.com.MethodOverloadingAndOverriding;

public class RunTimePolymorphismChildClass extends RunTimePolymorphismParentClass {

	/*
	 * runtime polymorphism: Method overriding or dynamic data dispatch The
	 * Overridden methods of the Child class can be called. Non-Overridden methods
	 * of the Parent class can be called. Child class methods cannot be called.
	 * 
	 */

	@Override
	public void Display() {
		System.out.println("Inside Display method of ChildClass");

	}

	private void Show() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunTimePolymorphismParentClass pp = new RunTimePolymorphismChildClass();
		pp.Display();
		pp.Disp2();
		pp.Disp3();
	}

}
