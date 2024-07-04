package assignmentLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add('j');
		l.add('e');
		l.add('s');
		l.add('s');
		l.add(true);
		l.add("jess");
		
		for(Object o : l) {
			System.out.println(o);
		}
		System.out.println("\n");
		Iterator i = l.iterator();
		while(i.hasNext()) {
			if(i.next().equals(true)) {
				i.remove();
			}
		}
		for(Object o : l) {
			System.out.println(o);
		}
	}
}
