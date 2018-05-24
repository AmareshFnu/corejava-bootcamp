package example.com.variabletypes;

public class LocalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariables lv = new LocalVariables();

		lv.addition();
	}

	public void addition() {
		int a = 10; // local variable should be assinged with some values.
		System.out.println(a = a + 10);

		/*
		 * few points about local variable
		 * 
		 * Local Variables========> Local variables are declared in methods,
		 * constructors, or blocks.
		 * 
		 * Local variables are created when the method, constructor or block is entered
		 * and the variable will be destroyed once it exits the method, constructor, or
		 * block.
		 * 
		 * Access modifiers cannot be used for local variables.
		 * 
		 * Local variables are visible only within the declared method, constructor, or
		 * block.
		 * 
		 * Local variables are implemented at stack level internally.
		 * 
		 * There is no default value for local variables, so local variables should be
		 * declared and an initial value should be assigned before the first use.
		 */

	}

}
