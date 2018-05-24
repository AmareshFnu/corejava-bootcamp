package example.com.programs2;

public class FibbonaciNumberNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibbonaciNumberNonRecursive fnr = new FibbonaciNumberNonRecursive();
		System.out.println(fnr.fib(11));

	}

	public int fib(int nthTerm) {

		int fib = 0;
		int n1 = 0;
		int n2 = 1;
		int counter = nthTerm;

		if (nthTerm == 0) {
			return nthTerm;
		} else if (nthTerm == 1 || nthTerm == 2) {
			return 1;
		}

		else {

			while (counter > 1) {
				fib = n1 + n2;

				// 0=0+1 , 1=1+1
				n1 = n2;
				n2 = fib;

				counter--;
				// System.out.println(fib);
			}
			return fib;
		}
	}

	// 0 1 1 2 3 5 8 13 21 34
}
