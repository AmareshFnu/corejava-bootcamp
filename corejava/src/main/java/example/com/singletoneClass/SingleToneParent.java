package example.com.singletoneClass;

public class SingleToneParent {

	/* lazy initialization of object */

	public static SingleToneParent stp = null;

	private SingleToneParent() {
		// TODO Auto-generated constructor stub
	}

	public static SingleToneParent getInstance() {
		if (stp == null) {
			stp = new SingleToneParent();
		}
		return stp;
	}

	public void addition() {

		System.out.println("Addition method is called::::::");
	}
}
