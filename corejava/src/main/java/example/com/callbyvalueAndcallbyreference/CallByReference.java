package example.com.callbyvalueAndcallbyreference;

public class CallByReference {

	int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CallByValue callbyvalue = new CallByValue();
		//
		// callByValue(callbyvalue.x);

		CallByReference callbyreference = new CallByReference();

		callbyreference.x = 10;
		callByReference(callbyreference);
		System.out.println("value after making change" + callbyreference.x);

		callByReferenceSingleValue(callbyreference.x);

		System.out.println( "value of x after calling"+callbyreference.x);
	}

	public static void callByReference(CallByReference a) {

		// a = CallByReference.x + 10;

		a.x = a.x + 10;

		System.out.println("value of a:::" + a.x);
	}

	public static void callByReferenceSingleValue(int a) {

		// a = CallByReference.x + 10;

		a = a + 10;

		System.out.println("value of a:::" + a);
	}

}
