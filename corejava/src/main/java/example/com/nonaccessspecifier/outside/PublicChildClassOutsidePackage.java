package example.com.nonaccessspecifier.outside;

import example.com.nonaccessspecifierclass.PublicParentClass;

public class PublicChildClassOutsidePackage extends PublicParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicParentClass parent = new PublicParentClass();
		parent.additionPublic();

	}

}
