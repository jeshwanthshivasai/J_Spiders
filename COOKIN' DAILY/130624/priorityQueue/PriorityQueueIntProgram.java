package priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueIntProgram {
public static void main(String[] args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		
		p.add(5);
		p.add(95);
		p.add(100);
		p.add(20);
		p.add(30);
		p.add(2);
		p.add(62);
		p.add(50);
		p.add(25);
		p.add(15);
		p.add(96);
		p.add(12);
		p.add(1);
		p.add(60);
		p.add(9);
		
		for(int i : p) {
			System.out.println(i);
		}
		System.out.println("\n");
		Iterator<Integer> i = p.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
