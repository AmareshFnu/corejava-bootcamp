package example.com.staticvariable;

public class StaticVariable {

	static int staticCounter = 0; // Memory will be created in class area only once when the class is loaded. This
									// is variable is shared and common property for all the objects
	int nonStaticCounter = 0; // Memory will be created in heap every time when the new object is created.Its
								// reference variable will be present in stack and actual object will be in heap

	private StaticVariable() {
		staticCounter++;
		nonStaticCounter++;
	}

	public void display() {
		System.out.println(staticCounter);
		System.out.println(nonStaticCounter);
	}

	public static void main(String[] args) {
		StaticVariable var1 = new StaticVariable();
		System.out.println(staticCounter);
		System.out.println(var1.nonStaticCounter);

		StaticVariable var2 = new StaticVariable();
		System.out.println(staticCounter);
		System.out.println(var2.nonStaticCounter);

		StaticVariable var3 = new StaticVariable();
		System.out.println(staticCounter);
		System.out.println(var3.nonStaticCounter);

	}

}
