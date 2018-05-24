package example.com.garbagecollection;

import java.util.ArrayList;
import java.util.List;

public class MemoryTest {
	public static void main(String args[]) throws Exception {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());
		
		
		List<String> list=new ArrayList<String>();

		for (int i = 1; i >0 ; i++) {
			new MemoryTest();
		}
		System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());
	}
}