package example.com.nonaccessspecifierclass;

public class PublicParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicParentClass par = new PublicParentClass();
		par.additionPrivate();

	}

	public void additionPublic() {
		System.out.println("Inside public method additionPublic::::::::::");
	}

	protected void additionProtected() {
		System.out.println("Inside protected method additionProtected::::::::::");
	}

	void additionDefault() {
		System.out.println("Inside default/package method additionDefault::::::::::");
	}

	private void additionPrivate() {
		System.out.println("Inside private method additionPrivate::::::::::");
	}
}
