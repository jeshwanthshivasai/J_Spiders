package CreatingExceptionsMyself;

public class Calendar {
	public int monthNumber;
	public void displayMonthNumber(int monthNumber) {
		if(monthNumber <= 12 && monthNumber >= 1) {
			System.out.println(monthNumber);
		} else {
			throw new InvalidMonthNumberException("12 months only");
		}
	}
}
