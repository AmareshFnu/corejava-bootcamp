package javafashion.loops;

import java.util.ArrayList;
import java.util.List;

public class WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		while (true) {

			System.out.println("Inside while loop");

			List<String> list = new ArrayList<String>();

			list.add("StartDate,end date , content");

			/* Get the alert from huble server */

			/* Lets say its in the form of string */

			String alert = "Start Date ,Enddate";

			if (list.contains(alert)) {
				// dont add the alert to list or jsob object since json object as the alert
				// already present
			} else {
				// add alert to list or json object

				list.add(alert);
			}

			Thread.sleep(6000);

		}
	}

}
