package example.com.nestedClass;

abstract class Person {
	abstract void eat();
}

public class TestAnonymousInner {
	public static void main(String args[]) {
		// Person p = new Person() {
		// void eat() {
		// System.out.println("nice fruits");
		// }
		// };
		// p.eat();

		Person p = new Person() {

			@Override
			void eat() {

				System.out.println("anonymous inner class example");
				// TODO Auto-generated method stub

			}
		};
p.eat();
	}
}