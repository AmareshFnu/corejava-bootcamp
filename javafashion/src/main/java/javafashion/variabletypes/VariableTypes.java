package javafashion.variabletypes;

public class VariableTypes {

	/*
	 * 1.Instance variable : We need to create an object in order to access instance
	 * variables, these variables are associated with object.a separate copy of the
	 * variables will be created each time the object is created.Memory is allocated
	 * in heap
	 */

	/*
	 * 2. Static variable or class variable: These variables are associated with the
	 * class, no need to create instance in order to access static variables, these
	 * are created with key word called static . a separate copy is not created
	 * instead memory is shared across the members of the class and subclass.We need
	 * to be careful while modifying static variable because modification will
	 * affect everywhere. Usually static variables are created if there is any
	 * common property in the class, example , company name is common for all the
	 * employees who works in the organization. The memory will be allocated in
	 * stack area for static variables unlike instance variable. Usually static
	 * variables are used to create constants.Hence its marked as final so that
	 * values can't be changed
	 */

	/*
	 * 3.Local variable: Local variables are created with in the method, the scope
	 * of these variables are limited with in the method.Memory will be allocated in
	 * stack for local variables.
	 * 
	 */

	/* Instance variables */
	private int empID;
	private String empName;
	private double empSalary;

	/*
	 * static variable or class variable, which is mostly used to create constants
	 * in real time
	 */
	public static final String companyName = "Exilant Technologies";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableTypes vt = new VariableTypes();
		vt.setEmpID(4568);
		vt.setEmpName("Amaresh");
		vt.setEmpSalary(10000.00);

		System.out.println(vt.getEmpID());
		System.out.println(vt.getEmpName());
		System.out.println(vt.getEmpSalary());
		System.out.println(VariableTypes.getCompanyname());

	}

	private int getEmpID() {
		return empID;
	}

	private void setEmpID(int empID) {

		this.empID = empID;

	}

	private String getEmpName() {
		return empName;
	}

	private void setEmpName(String empName) {
		this.empName = empName;
	}

	private double getEmpSalary() {
		return empSalary;
	}

	private void setEmpSalary(double empSalary) {
		/* local variables */
		int empBonus = 1000;
		this.empSalary = empSalary + empBonus;
	}

	private static String getCompanyname() {
		return companyName;
	}

}
