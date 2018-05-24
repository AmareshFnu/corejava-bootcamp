package example.com.misc;

public class StaticVariables {

	public String name = "AMC";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariables variable = new StaticVariables();
		StaticVariables variable1 = new StaticVariables();
		System.out.println(variable.name);

		variable.name = variable.name.concat(" Engineering college");
		System.out.println(variable1.name);
		System.out.println(variable.name);

	}

}
