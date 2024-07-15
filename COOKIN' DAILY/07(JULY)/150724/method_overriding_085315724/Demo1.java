package method_overriding_085315724;

abstract class A {
	void fly() {
		System.out.println("Fly");
	}
}
class B extends A {
	void dive() {
		System.out.println("Dive");
	}
}
public class Demo1 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.dive();
		b1.fly();
	}
}
