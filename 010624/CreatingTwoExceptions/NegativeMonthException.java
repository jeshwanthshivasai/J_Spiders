package CreatingTwoExceptions;

public class NegativeMonthException extends RuntimeException {
	public NegativeMonthException(String input) {
		super(input);
	}
}
