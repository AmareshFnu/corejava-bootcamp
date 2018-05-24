package example.com.programs;

public class FactP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int count = n-1;
		int fact = 0;

		while (count > 1) {
			fact = n * (count );
			n = fact;

			count--;
			System.out.println(fact);
		}
		

	}

}
