package assignmentArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAssignment {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("jess");
		l.add(2);
		l.add(29011999);
		l.add('j');
		l.add('e');
		l.add('s');
		l.add('s');
		l.add(true);
		l.add(false);
		l.add("jeshwanthshivasai");
		l.add("TS08JU2533");
		
//		for(int i=0; i<=l.size() - 1; i++) {
//			System.out.println(l.get(i));
//		}
//		System.out.println("\n");
//		
		for(Object o : l) {
			System.out.println(o);
		}
		System.out.println("\n");
		
		Iterator i = l.iterator();
		while(i.hasNext()) {
			if(i.next().equals('e'))
			{
				i.remove();
			}
		}
		for(Object o : l) {
			System.out.println(o);
		}
		System.out.println("\n");
	}
}