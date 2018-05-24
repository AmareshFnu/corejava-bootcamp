package example.corejava.com.accessspecifiers;

public class PrivateAccessSpecifierA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateAccessSpecifierA pasa=new PrivateAccessSpecifierA();
				pasa.addition(13,20);
	}

	private  void addition(int a, int b) {
		System.out.println("Inside Default access specifier method::::::::::");
	}

}
