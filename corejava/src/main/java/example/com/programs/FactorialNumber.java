package example.com.programs;

public class FactorialNumber {
	static int factorialNumber = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* example factorial of 5= 5*4*3*2*1=120 */

		FindFactorial(factorialNumber);

	}

	private static void FindFactorial(int Fnumber) {
		// TODO Auto-generated method stub

		int count = Fnumber - 1;
		while (count > 0) {

			Fnumber = Fnumber * count;

			count--;
		}
		System.out.println("Factorial of given number::" + Fnumber);
	}

}
