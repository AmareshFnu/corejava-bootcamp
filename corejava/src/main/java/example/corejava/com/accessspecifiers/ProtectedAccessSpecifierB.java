package example.corejava.com.accessspecifiers;

public class ProtectedAccessSpecifierB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessSpecifierA protectedAS = new ProtectedAccessSpecifierA();
		// pas.addition(1,1); : Here there is a compilation error, we cant access
		// private methods outside other class
		protectedAS.addition(10, 20);

	}

}
