package example.com.callbyvalueAndcallbyreference;

public class CallByValue {

	static int x = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CallByValue callbyvalue = new CallByValue();
		//
		// callByValue(callbyvalue.x);

		callByValue(x);

		System.out.println("value of x::::::" + x);

	}

	public static void callByValue(int a) {

		a = a + 10;
		System.out.println("value of a:::" + a);
	}

}
