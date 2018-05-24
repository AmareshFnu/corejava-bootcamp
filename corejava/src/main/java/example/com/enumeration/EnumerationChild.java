package example.com.enumeration;

public class EnumerationChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MonthEnumeration[] en = MonthEnumeration.values();

		for (MonthEnumeration monthEnumeration : en) {

			System.out.println(monthEnumeration);

		}

	}

}
