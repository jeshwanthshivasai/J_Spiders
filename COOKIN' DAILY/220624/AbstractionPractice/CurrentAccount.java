package AbstractionPractice;

public class CurrentAccount implements Bank{

	@Override
	public void deposit() {
		System.out.println("Deposited Money to Current Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Credited Money to Current Account");
	}
}
