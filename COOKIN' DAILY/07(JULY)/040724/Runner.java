package runner;

public class Runner {
	private int jerseynumber;
	private double speed;
	private static int distance = 40;
	
	public void initialise(String nm, int n, double s) {
		if(n > 0 && n < 99) {
			jerseynumber = n;
		} else {
			System.err.println("Invalid Data");
		}
		if(s >= 10.0 && s <= 15.0) {
			speed = s;
		} else {
			System.err.println("Invalid Data");
		}
	}
	public double calculateTime() {
		double time=distance/speed;
		return time;
	}
	public void displayRunnerDetails() {
		System.out.println("Jersey Number: " + jerseynumber);
		System.out.println("Speed: " + speed);
		System.out.println("Time Taken: " + calculateTime());
	}
}