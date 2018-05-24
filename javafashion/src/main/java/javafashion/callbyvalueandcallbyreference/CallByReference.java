package javafashion.callbyvalueandcallbyreference;

public class CallByReference {

	@Override
	public String toString() {
		return "CallByReference [a=" + a + "]";
	}

	private int a = 100;
	static int b;

	static {
		b = 100;

		// Observe that , only static variables are initialized here, compiler will give
		// warning message if you try to initialize any variable other than static

		// 1.You can initialize browser
		// 2.You can initialize data base connection
		// 3.You can initialize native methods
		// 4.You can also initialize static variable

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByReference cbr = new CallByReference();
		System.out.println("Value of object 'a' before passing it to addition method:::: " + cbr.a);
		cbr.addition(cbr);
		System.out.println("Value of object 'a' After passing it to addition method:::: " + cbr.a);

		System.out.println(
				"Notice that, value of the object got modified and its affected at object level, this is the example for callby reference, here we are passing a reference in"
						+ " the calling method, if the object manipulation is done in called method, that will reflect at class object level, there is no seperate copy is created, "
						+ "we should be careful while passing object as a parameter in calling method " + cbr.a);

	}

	private void addition(CallByReference cbr) {
		cbr.a = cbr.a + 100;
		System.out.println("Value of object 'a':::: " + cbr.toString());

	}

}
