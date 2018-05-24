package javafashion.callbyvalueandcallbyreference;

public class CallByValue {

	private int a = 100;
	private String str = "Hello";

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		final int a = 100;

		// Im passing here object with specific object its one way sending an variable
		// reference
		// CallByValue cbv = new CallByValue();
		// System.out.println("Value of a before calling addition method " + cbv.a);
		// cbv.addition(cbv.a);
		// System.out.println("Value of a After calling addition method " + cbv.a);

		System.out.println("Value of the local variable 'a' before passing as parameter is::: " + a);
		addition(a);
		System.out.println("Value of the local variable 'a' after passing as parameter is :::: " + a);

		System.out.println(
				"That means value of 'a' remains same even after modification is done in addition method, hence it proves that the seperaete copy has been created and which has been sent to calling method, therefore  changes made in called method has no affected in calling method");

	}

	private static void addition(int a) {

		a = a + 10;
		System.out.println("Value of local variable 'a; inside addition method is:::: " + a);

	}

}
