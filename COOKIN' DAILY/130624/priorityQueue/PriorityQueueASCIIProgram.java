package priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueASCIIProgram {
	public static void main(String[] args) {
		
		PriorityQueue<Character> p = new PriorityQueue<Character>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter objects - ");
		for(int i = 0; i<= 8; i++) {
			char ch = sc.next().charAt(0);
			p.add(ch);
		}
		
//		p.add('Z');
//		p.add('a');
//		p.add('C');
//		p.add('f');
//		p.add('l');
//		p.add('K');
//		p.add('d');
//		
		for(char c : p) {
			System.out.println(c);
		}
		System.out.println("\n");
		Iterator i = p.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
