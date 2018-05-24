package example.com.defaultconstructor;

public class PrivateConstructor {

	private PrivateConstructor() {
		// TODO Auto-generated constructor stub
	}

	private static PrivateConstructor pc = new PrivateConstructor();

	public static PrivateConstructor getObject() {
		return pc;
	}

}
