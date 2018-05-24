package javafashion.nonaccessmodifiers;

import java.util.Date;

public class NonAccessModifiersParent extends NonAccessModifiersAbstract {

	/*
	 * Non access modifiere in Java 1.Static 2.final 3.Abstract 4.volatile
	 * 5.StritctFP 6.synchronized
	 *
	 * Rules of final modifier: can be used with class, variable and method, You
	 * can't extend class that has been created with final key word you can't modify
	 * value for variable that is created with final modifier you can't override
	 * method that is declared with final modifier
	 * 
	 * 
	 * Rules of static modifier: You can use this with variable and method.No need
	 * to create instance in order to access variable and methods of the class that
	 * is declared with static key word
	 * 
	 * Rules of Abstract modifier: You can use Abstract key word for Classes and
	 * methods but can't be used for variables. Class that is declared with modifier
	 * abstract, that should be extended like normal class, but you can't create an
	 * object for abstract class.all the methods that are created with abstract key
	 * word should be overridden/implemented in child class
	 */

	private int empID;
	private String empName;
	private Double empSalary;
	public static final String companyName = "Exilant Technologies"; // 1. Non access modifiers final and static

	public volatile Date dob;
	public transient Date dob1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonAccessModifiersAbstract ama = new NonAccessModifiersParent();
		ama.nonAccessModifiersAbstractMethod();
	}

	/*
	 * 2. All the abstract method should be implemented if its exteneded abstract
	 * class
	 */

	@Override
	void nonAccessModifiersAbstractMethod() {
		// TODO Auto-generated method stub

		System.out.println("This is overriden method from abstract parent class");

	}

	public static final native void nativeModifier();

	public strictfp void show() {

	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	synchronized String getEmpName() {
		return empName;
	}

	synchronized void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public static String getCompanyname() {
		return companyName;
	}

}
