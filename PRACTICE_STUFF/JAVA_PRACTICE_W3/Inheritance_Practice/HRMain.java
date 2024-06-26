package JAVA_PRACTICE_W3.Inheritance_Practice;

public class HRMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.work();
		e.getSalary();
		HRManager h = new HRManager();
		h.work();
		h.getSalary();
		HRManager h1 = new HRManager();
		h1.addEmployee();
	}
}
