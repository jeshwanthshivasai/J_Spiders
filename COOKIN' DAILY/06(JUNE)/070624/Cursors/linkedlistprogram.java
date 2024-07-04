package Cursors;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistprogram {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(2);
		list.add("jesse");
		list.add('j');
		list.add(true);
		
		Iterator i = list.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}