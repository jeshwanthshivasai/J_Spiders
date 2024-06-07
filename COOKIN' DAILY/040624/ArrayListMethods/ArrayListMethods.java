package ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(22);
		list.add(333);
		list.add('J');
		list.add(true);
		list.add(1.23);
		list.add(1.234);
		list.add("jess");
		list.add(12345);
		
		System.out.println(list);
		
		ArrayList l1 = new ArrayList();
		l1.add("ramya, welcome to my arraylist");
		l1.add(l1);
		l1.add(list);
		l1.add(1, l1);
		l1.clear();
		l1.contains(list);
		l1.containsAll(l1);
		l1.get(7);
		l1.indexOf(l1);
		l1.isEmpty();
		l1.lastIndexOf(list);
		l1.remove(2);
		l1.remove(list);
		l1.set(0, l1);
		l1.size();
		l1.toArray();
	}
}