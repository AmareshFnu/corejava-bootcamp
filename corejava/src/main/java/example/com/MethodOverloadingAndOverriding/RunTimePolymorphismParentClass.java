package example.com.MethodOverloadingAndOverriding;

public class RunTimePolymorphismParentClass {

	public void Display() {
		System.out.println("Inside Display method of ParentClass");

	}

	private void Disp() {
		System.out.println("Inside Disp method of ParentClass");

	}

	public void Disp2() {
		System.out.println("Inside Disp2 method of ParentClass");

	}

	public static void Disp3() {
		System.out.println("Inside Disp3 method of ParentClass::: static method");

	}
}
