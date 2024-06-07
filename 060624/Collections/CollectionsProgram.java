package Collections;

import java.util.Vector;

public class CollectionsProgram {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(2);
		v.addElement("jess");
		v.add(3);
		v.capacity();
		System.out.println(v.capacity());
		v.insertElementAt("jess", 1);
//		v.remove(0);
		v.removeElementAt(2);
		v.setElementAt(4, 0);
//		v.removeAllElements();
		v.size();
		v.capacity();
		
		System.out.println(v);
	}
}