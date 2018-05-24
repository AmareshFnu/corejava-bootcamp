package javafashion.threads;

class A extends Thread {

	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Fizz");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class B extends Thread {

	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Buzz");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadUsingThreadClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		A a = new A();
		B b = new B();
		a.start();
		b.start();

	}

}
