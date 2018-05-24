package javafashion.child;

import javafashion.accessmodifiers.AccessModifiers;

public class AccessModifierChild extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierChild am = new AccessModifierChild();

		am.setEmpID(4568);
		am.setEmpName("Amaresh");

		System.out.println(am.getEmpID());
		System.out.println(am.getEmpName());
		System.out.println(AccessModifierChild.getCompanyname());
	}

}
