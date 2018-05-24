package example.com.exceptions;

public class TryMultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * If you are wondering why we need other catch handlers when we have a generic
		 * that can handle all. This is because in generic exception handler you can
		 * display a message but you are not sure for which type of exception it may
		 * trigger so it will display the same message for all the exceptions and user
		 * may not be able to understand which exception occurred. Thats the reason you
		 * should place is at the end of all the specific exception catch blocks
		 */

		try {
			int a[] = new int[7];
			a[4] = 30 / 0;
			System.out.println("First print statement in try block");
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}
		System.out.println("Out of try-catch block...");
	}
}