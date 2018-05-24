package example.com.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int naturalNumbers = 10;

		for (int i = 2; i < naturalNumbers; i++) {

			for (int j = 2; j < i / 2; j++) {

				if (i % 2 == 0) {
					System.out.println(i + "is not a prime number");
				} else {
					System.out.println(i + "is prime number");
				}

			}

		}

	}

}
