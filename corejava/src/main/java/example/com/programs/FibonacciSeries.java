package example.com.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 0 1 1 2 3 5 8 13 */

		int firstNumber = 0;
		int secondNumber = 1;

		int nextNumber;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int i = 0; i < 10; i++) {
			nextNumber = firstNumber + secondNumber;
			System.out.println(nextNumber);
			firstNumber = secondNumber;
			secondNumber = nextNumber;

		}

	}

}
