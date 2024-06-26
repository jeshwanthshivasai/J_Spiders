package JAVA_PRACTICE_W3.Abstraction_Practice;

public class HelperClass {
	public static Bank Helpermethod() {
		Bank b1 = new SavingsAccount();
		return b1;
//		b1.deposit();
//		b1.withdraw();

//		b2.deposit();
//		b2.withdraw();
	}
}