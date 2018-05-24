package example.corejava.com.accessspecifiers;

public class PrivateAccessSpecifierB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateAccessSpecifierA pas = new PrivateAccessSpecifierA();
//		pas.addition(1,1);  : Here there is a compilation error, we cant access private methods outside other class

	}

}
