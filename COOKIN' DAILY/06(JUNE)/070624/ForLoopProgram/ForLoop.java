package ForLoopProgram;

import java.util.ArrayList;

public class ForLoop {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(2);
		l.add("jess");
		l.add(true);
		l.add('J');
		
		for(int i=0; i<=l.size()-1; i++) {
			System.out.println(l.get(i));
		}
		
		for(Object o : l) {
			System.out.println(o);
		}
	}
}
