package Method_Overloading;

public class ClassMethodOverloading {
	public void test(char c) {
		System.out.println("Test method with 1 argument of char type");
	}
	public void test(boolean b1, boolean b2) {
		System.out.println("Test method with 2 arguments of boolean type");
	}
	public void test(int i1, int i2, String s) {
		System.out.println("Test method with 3 arguments of 2 int & 1 String type");
	}
	public static void main(String[] args) {
		ClassMethodOverloading c1 = new ClassMethodOverloading();
		c1.test('j');
		ClassMethodOverloading c2 = new ClassMethodOverloading();
		c2.test(false, false);
		ClassMethodOverloading c3 = new ClassMethodOverloading();
		c3.test(2, 11, "jesse");
	}
}
