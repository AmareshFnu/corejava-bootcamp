package example.com.singletoneClass;

public class SingleToneChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleToneParent pa=SingleToneParent.getInstance();
		pa.addition();

	}

}
