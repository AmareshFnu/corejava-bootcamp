package example.com.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Amaresh");
		Employee emp2 = new Employee(2, "Bheemesh");

		List<Object> list = new ArrayList<Object>();
		list.add(emp1);
		list.add(emp2);

		System.out.println(list.toString());
	}
}
