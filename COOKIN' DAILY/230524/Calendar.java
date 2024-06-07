class Calendar {
	private int monthNumber;
	public Calendar(int monthNumber) {
		if (monthNumber > 0 && monthNumber <= 12) {
			this.monthNumber = monthNumber;
		}
	}
	public void display() {
		if (monthNumber != 0) {
		System.out.println(monthNumber);
	}
		else {
			System.out.println("invalid data");
		}
	}
}