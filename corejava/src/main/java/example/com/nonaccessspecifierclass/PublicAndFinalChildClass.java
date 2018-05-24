package example.com.nonaccessspecifierclass;

public class PublicAndFinalChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicAndFinalParentClass finalParentClass = new PublicAndFinalParentClass();
		finalParentClass.additionDefault();
		finalParentClass.additionProtected();
		finalParentClass.additionPublic();

	}

}
