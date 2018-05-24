package example.corejava.com.accessspecifiers.outsidepackage;

import example.corejava.com.accessspecifiers.DefaultAccessSpecifierA;

public class AccessSpecifierB extends DefaultAccessSpecifierA {

	public static void main(String[] args) {

		DefaultAccessSpecifierA das = new DefaultAccessSpecifierA();
		
//		das.addition(12,13); see there is a compilation error, because scope of the packe access specifier is limited with in the package
		

	}
}
