package AbstractionPractice;

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
