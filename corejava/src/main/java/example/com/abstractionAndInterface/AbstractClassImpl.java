package example.com.abstractionAndInterface;

public class AbstractClassImpl extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ac = new AbstractClassImpl();
		ac.addition();
		ac.division();
	}

	@Override
	protected void addition() {
		// TODO Auto-generated method stub
		System.out.println("Inside Addition method of child classs:::::::::::");
	}

}
