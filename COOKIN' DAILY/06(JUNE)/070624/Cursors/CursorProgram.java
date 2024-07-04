package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorProgram {
	public static void main(String[] args) {
		 ArrayList l = new ArrayList();
		 
		 l.add(2);
		 l.add('j');
		 l.add("jess");
		 l.add(true);
		 
		 Iterator i = l.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
	}
}
