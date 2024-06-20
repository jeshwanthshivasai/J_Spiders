package Method_Overloading;

public class DivisionOverloading {
	public static int divide(int a, int b) {
		int remainder = a/b;
		return remainder;
	}
	public void divide(double d1, double d2) {
		double divide = d1/d2;
		System.out.println(divide);
	}
	public static void main(String[] args) {
		int remainder = divide(1, 2);
		System.out.println(remainder);
		
		DivisionOverloading d = new DivisionOverloading();
		d.divide(2.11, 2.22);
	}	
}
