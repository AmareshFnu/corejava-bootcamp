package example.com.jvm;

import java.lang.reflect.Method;

public class JavaVirtualMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class<?> c = Class.forName("java.awt.Point");
			System.out.println("name = " + c.getName());
			System.out.println("package = " + c.getPackage());
			Method[] methods = c.getDeclaredMethods();
			System.out.println("----- Class methods ---------------");
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
