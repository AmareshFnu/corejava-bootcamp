package example.com.nonaccessspecifierclass;

public class PublicChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicParentClass parent = new PublicParentClass();
		parent.additionPublic();
		parent.additionProtected();
		parent.additionDefault();
	}

}
