package Cursors;

import java.util.Iterator;
import java.util.TreeSet;

public class SetProgram {
	public static void main(String[] args) {
		
		TreeSet set =new TreeSet();
		
		set.add("ravi");
		set.add("qwer");
		set.add("tyui");
		
		Iterator i=set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}