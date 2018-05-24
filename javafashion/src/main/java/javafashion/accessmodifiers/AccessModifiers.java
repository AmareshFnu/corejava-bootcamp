package javafashion.accessmodifiers;

import java.util.Calendar;
import java.util.Date;

public class AccessModifiers {

	/*
	 * Java provides below access modifiers 1. Private 2.Default 3. Protected
	 * 4.Public
	 */
	/*
	 * 1.You can create class with Public and default access specifiers 2.You can
	 * create variables with, private, protected,default and public access
	 * specifiers. 3.You can create methods with private, protected,default and
	 * public access specifiers.
	 * 
	 * Rules of private modifiers: 1.If you create variables or method with private
	 * key word, you can't access them from outside the class, you can only access
	 * them with in the class.Meaning visibility is within the class.In order to
	 * access outside the class, you need to create getters and setters with proper
	 * access modifier.
	 * 
	 * Rules of protected modifiers: If you create method or variables with
	 * protected key word.The visibility is with in the package and sub-class or
	 * child class of the other package
	 * 
	 * Rules of public modifiers: visibility is set to outside world, any one can
	 * access. example main method which is declared as public.
	 */

	private static double empSalary;
	protected int empID;
	Date empDOB; // Default access modifiers
	public String empName;
	public static final String companyName = "Exilant Technologies";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers am = new AccessModifiers();

		Calendar cal = Calendar.getInstance();
		cal.set(1987, 9, 6);

		am.setEmpID(4568);
		am.setEmpName("Amaresh");
		am.setEmpDOB(cal.getTime());
		am.setEmpSalary(15000.86);

		System.out.println(am.getEmpID());
		System.out.println(am.getEmpName());
		System.out.println(am.getEmpDOB());
		System.out.println(am.getEmpSalary());
		System.out.println(AccessModifiers.getCompanyname());
	}

	private double getEmpSalary() {
		return empSalary;
	}

	private void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	Date getEmpDOB() {
		return empDOB;
	}

	void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}

	public static String getCompanyname() {
		return companyName;
	}

	protected int getEmpID() {
		return empID;
	}

	protected void setEmpID(int empID) {
		this.empID = empID;
	}

}
