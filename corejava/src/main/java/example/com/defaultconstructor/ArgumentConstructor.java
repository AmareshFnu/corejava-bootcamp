package example.com.defaultconstructor;

public class ArgumentConstructor {

	private ArgumentConstructor(int a, float b, String str, char[] chr) {
		super();
		this.a = a;
		this.b = b;
		this.str = str;
		this.chr = chr;
	}

	int a;
	float b;
	String str;
	char chr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = { 'a', 'b', 'c' };
		ArgumentConstructor obj = new ArgumentConstructor(10, 20, "Hello", ch);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.chr);
		System.out.println(obj.str);

	}

}
