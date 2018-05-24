package example.com.threads;

class getNameSetNameGetIdofThrea extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		getNameSetNameGetIdofThrea t1 = new getNameSetNameGetIdofThrea();
		getNameSetNameGetIdofThrea t2 = new getNameSetNameGetIdofThrea();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());
		System.out.println("id of t1:" + t1.getId());

		t1.start();
		t2.start();

		t1.setName("Devil");
		System.out.println("After changing name of t1:" + t1.getName());
	}
}