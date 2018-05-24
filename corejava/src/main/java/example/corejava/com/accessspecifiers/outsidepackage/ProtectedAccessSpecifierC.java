package example.corejava.com.accessspecifiers.outsidepackage;

import example.corejava.com.accessspecifiers.ProtectedAccessSpecifierA;

public class ProtectedAccessSpecifierC extends ProtectedAccessSpecifierA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessSpecifierA protectedAS = new ProtectedAccessSpecifierA();

//		protectedAS.addition(10, 20);
//		protected access specifiers can not be accessed outside the class
	}

}
