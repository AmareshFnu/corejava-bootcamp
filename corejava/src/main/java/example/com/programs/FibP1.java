package example.com.programs;

public class FibP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 0;
		int number2 = 1;
		int count = 10;
		int fib = 0;

		System.out.println("Finding fibbonaci serier of given number-->  "+count);
		System.out.print(number1+" ");
		System.out.print(number2+" ");

		while (count > 0) {

			fib = number1 + number2;
			number1 = number2;
			number2 = fib;

			System.out.print(fib+" ");
			count--;
		}
	}

}
