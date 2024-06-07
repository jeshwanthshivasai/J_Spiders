package CreatingTwoExceptions;

public class PositiveMonthException extends RuntimeException {
	public PositiveMonthException(String input) {
		super(input);
	}
}
