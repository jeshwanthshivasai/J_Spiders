package Method_Overloading;

public class AdditionOverloading {
	public static void add(int a, int b) {
		int add = a+b;
		System.out.println("Sum of " + a + ", " + b + " is " + add);
	}
	public static void add(int a, int b, int c) {
		int add = a+b+c;
		System.out.println("Sum of " + a + ", " + b + ", " + c + " is " + add);
	}
	public static void add(int a, double d) {
		double add = a+d;
		System.out.println("Sum of " + a + ", " + d + " is " + add);
	}
	public static void add(double d1, double d2) {
		double add = d1+ d2;
		System.out.println("Sum of " + d1 + ", " + d2 + " is " + add);
	}
	public static void main(String[] args) {
		add(1, 2);
		add(1, 2, 3);
		add(1, 1.11);
		add(2.11, 2.22);
	}
}
