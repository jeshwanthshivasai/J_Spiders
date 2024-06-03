package CreatingExceptions;

public class Calendar {
	
	public void displayMonthNumber(int monthNumber)
	{
		if(monthNumber<=12 && monthNumber>=1)
		{
		System.out.println(monthNumber);
		}
		else
		{
			throw new InvalidMonthNumberException("Invalid month number");
		}
	}
}
