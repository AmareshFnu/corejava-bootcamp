package example.com.failFastAndFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {
	public static void main(String args[]) {
		List<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		int indexFlag = 0;
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			indexFlag++;
			if (indexFlag == 2) {
				al.remove(indexFlag);
			}
			System.out.println(it.next());

		}

	}
}