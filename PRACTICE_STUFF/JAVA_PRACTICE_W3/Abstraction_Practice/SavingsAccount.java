package JAVA_PRACTICE_W3.Abstraction_Practice;

public class SavingsAccount implements Bank{

	@Override
	public void deposit() {
		System.out.println("Deposited Money to Savings Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Credited Money to Savings Account");
	}
}
