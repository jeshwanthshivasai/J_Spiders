package Method_Overloading;

public class MainOverloading {
	public static void main(String a, String b, String c) {
		String fullname = a+b+c;
		System.out.println(fullname);
	}
	public void main(int date, int month, int year) {
		int dob = date+month+year;
		System.out.println(dob);
	}
	public static void main(String[] args) {
		main("jeshwanth", "shiva", "sai");
		MainOverloading m = new MainOverloading();
		m.main(29, 1, 1999);
	}
}
