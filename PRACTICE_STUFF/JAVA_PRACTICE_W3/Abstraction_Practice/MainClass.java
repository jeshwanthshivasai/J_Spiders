package JAVA_PRACTICE_W3.Abstraction_Practice;

public class MainClass {
	public static void main(String[] args) {
		Bank b1 = HelperClass.Helpermethod();
		b1.withdraw();
		b1.deposit();
		Bank b = HelperClass1.Helpermethod1();
		b.deposit();
		b.withdraw();
	}
}
