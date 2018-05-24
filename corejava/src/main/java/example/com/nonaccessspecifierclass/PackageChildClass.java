package example.com.nonaccessspecifierclass;

public class PackageChildClass extends PackageParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PackageParentClass packageParentClass=new PackageParentClass();
		packageParentClass.set_default("Hello");
		packageParentClass.get_default();
		packageParentClass.set_protected("Hiiiiiiiii");
		packageParentClass.get_protected();
		packageParentClass.get_private();
		packageParentClass.get_public();
		
		

	}

}
