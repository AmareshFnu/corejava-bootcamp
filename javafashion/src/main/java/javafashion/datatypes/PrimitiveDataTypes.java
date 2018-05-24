package javafashion.datatypes;

public class PrimitiveDataTypes {
	// declare and initialize 8 primitive data types available in java

	/* 1. Integer */
	byte _byte;
	short _short;
	int _int;
	long _long;

	/* 2.Floating point or decimals */
	double _double;
	float _float;

	/* 3.boolean representation */
	boolean _boolean;

	/* 4.Characters */
	char _char;

	public static void main(String[] args) {
		PrimitiveDataTypes pdt = new PrimitiveDataTypes();
		pdt._byte = 12;
		pdt._int = 100;
		pdt._long = 12548;
		pdt._double = 12.99;
		pdt._float = 18;
		pdt._boolean = true;
		pdt._char = 'A';

		System.out.println(pdt._byte);
		System.out.println(pdt._int);
		System.out.println(pdt._long);
		System.out.println(pdt._double);
		System.out.println(pdt._float);
		System.out.println(pdt._boolean);
		System.out.println(pdt._char);

	}

}
