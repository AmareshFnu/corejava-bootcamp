package example.com.variabletypes;

public class InstanceVariable {

	/*
	 * Instance variables are declared in a class, but outside a method, constructor
	 * or any block.
	 * 
	 * When a space is allocated for an object in the heap, a slot for each instance
	 * variable value is created.
	 * 
	 * Instance variables are created when an object is created with the use of the
	 * keyword 'new' and destroyed when the object is destroyed.
	 * 
	 * Instance variables hold values that must be referenced by more than one
	 * method, constructor or block, or essential parts of an object's state that
	 * must be present throughout the class.
	 * 
	 * Instance variables can be declared in class level before or after use.
	 * 
	 * Access modifiers can be given for instance variables.
	 * 
	 * The instance variables are visible for all methods, constructors and block in
	 * the class. Normally, it is recommended to make these variables private
	 * (access level). However, visibility for subclasses can be given for these
	 * variables with the use of access modifiers.
	 * 
	 * Instance variables have default values. For numbers, the default value is 0,
	 * for Booleans it is false, and for object references it is null. Values can be
	 * assigned during the declaration or within the constructor.
	 * 
	 * Instance variables can be accessed directly by calling the variable name
	 * inside the class. However, within static methods (when instance variables are
	 * given accessibility), they should be called using the fully qualified name.
	 * ObjectReference.VariableName.
	 */

	private int a = 100;
	private float b = 10;
	private String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition();

	}

	public static void addition() {
		InstanceVariable iv = new InstanceVariable();
		System.out.println(iv.b = iv.b + 10);
	}

}
