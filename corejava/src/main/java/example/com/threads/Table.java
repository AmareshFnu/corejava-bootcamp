package example.com.threads;

class Table {
	// void printTable(int n) {// method not synchronized

	/*
	 * Synchronized method is used to lock an object for any shared resource.
	 * 
	 * When a thread invokes a synchronized method, it automatically acquires the
	 * lock for that object and releases it when the thread completes its task.
	 */

	synchronized void printTable(int n) {// method synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}