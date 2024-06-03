package ArrayList;

import java.util.ArrayList;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.contains(5));
		System.out.println(list.isEmpty());
		System.out.println(list.set(0, 2));
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list);
	}
}