package javafashion.accessmodifiers;

import java.util.Calendar;

public class AccessModifiersChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers am = new AccessModifiers();

		RuntimeException re = new RuntimeException();
		System.out.println(re.fillInStackTrace());

		Calendar cal = Calendar.getInstance();
		cal.set(1987, 9, 6);

		/* Default access modifier */
		am.setEmpDOB(cal.getTime());

		/* Protected access modifier */
		am.setEmpID(4568);

		/* Public access modifier */
		am.setEmpName("Amaresh");

		System.out.println(am.getEmpID());
		System.out.println(am.getEmpName());
		System.out.println(am.getEmpDOB());

		/*
		 * Accessing static fields with out instance, accessing them with class name
		 * since they are accosiated with the class
		 */
		System.out.println(AccessModifiers.getCompanyname());

		/*
		 * however we can still access them with instance, No difference, but best
		 * pratice is to access them with the class name
		 */
		System.out.println(am.getCompanyname());
	}

}
