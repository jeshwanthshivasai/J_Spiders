package CreatingTwoExceptions;

public class Calendar {
	public int monthNumber;
	public void display(int monthNumber) {
		if (monthNumber > 12) {
			throw new PositiveMonthException("Positive Exception bro!");
		} else if (monthNumber<1) {
			throw new NegativeMonthException("Negative Exception bro!");
		} else {
			System.out.println(monthNumber);
		}
	}
}