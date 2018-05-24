package example.com.programs2;

public class FibbonaciNumberRecursive {

	int number;
	int n1 = 0;
	int n2 = 1;

	public int fibonacci(int number) {
		if (number == 1 || number == 2) {

			return 1;

		}
		return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibbonaciNumberRecursive fib = new FibbonaciNumberRecursive();
		System.out.println(fib.fibonacci(9));

	}
}
