package Constructors;

public class Main {
	public static void main(String[] args) {
		
		Tester t1 = new Tester("ravi", 1, "tester", 20000, "tekpyramid", 1, "hyderabad");
		t1.display();
		System.out.println("\t");
		System.out.println("---------------------------------");
		Tester t2 = new Tester("kiran", 2, "tester", 30000, "tekpyramid", 2, "hyderabad");
		t2.display();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Developer d1 = new Developer("ravi", 1, "developer", 200000, "tekpyramid", 1, "hyderabad", 2000);
		t1.display();
		System.out.println("\t");
		System.out.println("---------------------------------");
		Developer d2 = new Developer("kiran", 2, "developer", 300000, "tekpyramid", 2, "hyderabad", 2000);
		t2.display();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Hr hr1 = new Hr("ravi", 1, "hr", 60000, "tekpyramid", "hyderabad", 2000);
		t1.display();
		System.out.println("\t");
		System.out.println("---------------------------------");
		Hr hr2 = new Hr("kiran", 2, "hr", 50000, "tekpyramid", "hyderabad", 2000);
		t2.display();
	}
}