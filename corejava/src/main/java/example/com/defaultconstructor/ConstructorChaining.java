package example.com.defaultconstructor;

public class ConstructorChaining extends DefaultConstructor {

	char ch[] = { 'a', 'b', 'c' };

	private ConstructorChaining() {
		this(10);

		// TODO Auto-generated constructor stub
	}

	private ConstructorChaining(int a) {
		this.addition();
		System.out.println("constructor chaining works fine!!!");
	}

	public void addition() {

		System.out.println("inside addition method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining aa = new ConstructorChaining();
	}

}
