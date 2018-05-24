package example.corejava.com.accessspecifiers;

public class PublicAccessSpecifierB extends PublicAccessSpecifierA {

	private PublicAccessSpecifierB() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		PublicAccessSpecifierA publicAccessSpecifierA=new PublicAccessSpecifierA();
		publicAccessSpecifierA.addition(10, 20);
	}
	

}
