package example.com.exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 50 / 0;

			System.out.println(a);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Rest of the program excecuted:::::::::");
	}

}
