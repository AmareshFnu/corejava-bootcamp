package example.com.staticBlock;

public class StaticBlock {

	static int a;
	int b;

	static {

		a = 100;
		System.out.println(a);
	}
	static {

		a = 300;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
