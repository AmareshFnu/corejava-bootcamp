package example.com.garbagecollection;

public class GrabgeCollection {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		GrabgeCollection gc = new GrabgeCollection();
		gc = null;
		System.gc();
		// finalize method is invoked by GC.Here since object has no reference gc=null.
		// hence its availble for GC. hence system.gc method executed successful with
		// out termination.And also notice that finalize method has been triggered by
		// GC.IF object reference is not null then application terminates and it wont
		// invoke finalize method. And we cant guarentee that which thread will trigger
		// finalize method

		// System.gc();

	}

	public void finalize() {
		System.out.println("Finalize method is executed");

	}

}
