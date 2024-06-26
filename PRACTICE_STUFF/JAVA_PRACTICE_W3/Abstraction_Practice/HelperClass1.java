package JAVA_PRACTICE_W3.Abstraction_Practice;

public class HelperClass1 {
	public static Bank Helpermethod1() {
		Bank b = new CurrentAccount();
		return b;
	}
}
