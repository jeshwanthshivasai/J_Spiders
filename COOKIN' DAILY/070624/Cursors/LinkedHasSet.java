package Cursors;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(2);
		lhs.add("jesse");
		lhs.add('j');
		lhs.add(true);
		
		Iterator i = lhs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
