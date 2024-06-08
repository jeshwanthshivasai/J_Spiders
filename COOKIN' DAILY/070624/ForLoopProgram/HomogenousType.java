package ForLoopProgram;

import java.util.ArrayList;

public class HomogenousType {
	public static void main(String[] args) {
		
		ArrayList <Character> l = new ArrayList <Character> ();
		
		l.add('j');
		l.add('e');
		l.add('s');
		l.add('s');
		l.add('e');
		
		for(char i=0;  i<=l.size() - 1; i++) {
			System.out.println(l.get(i));
		}
		
		for(Object o : l) {
			System.out.println(o);
		}
	}
}
