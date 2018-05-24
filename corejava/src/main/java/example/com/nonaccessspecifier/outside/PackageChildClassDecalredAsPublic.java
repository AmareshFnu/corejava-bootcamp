package example.com.nonaccessspecifier.outside;

import example.com.nonaccessspecifierclass.PackageChildClass;

public class PackageChildClassDecalredAsPublic extends PackageChildClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PackageChildClass aa=new PackageChildClass();
		aa.get_default();

	}

}
