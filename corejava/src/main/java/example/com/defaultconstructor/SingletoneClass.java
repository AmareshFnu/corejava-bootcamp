package example.com.defaultconstructor;

public class SingletoneClass {

	public static SingletoneClass obj = null;

	private SingletoneClass() {
		// TODO Auto-generated constructor stub
	}

	public static SingletoneClass objectCreationMethod() {
		/*
		 * This logic will ensure that no more than one object can be created at a time
		 */
		if (obj == null) {
			obj = new SingletoneClass();
		}
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletoneClass stc1 = SingletoneClass.objectCreationMethod();
		SingletoneClass stc2 = SingletoneClass.objectCreationMethod();

	}

}
