package example.com.programs;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * * * * * * * * * * * *
		 */

		for (int i = 5; i > 0; i--) {

			print(i);
		}

	}

	private static void print(int numberofprintstatmenet) {
		// TODO Auto-generated method stub
		System.out.println();
		for (int j = 0; j < numberofprintstatmenet; j++) {
			System.out.print("*");

		}

	}

}
