package to_string__student_assignment;

public class Student {
	private int id;
	private String name;
	private int age;
	private String degree;
	
	public Student(int id, String name, int age, String degree) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.degree=degree;
	}
	
	public String toString() {
		return ("The student with (" + id + ") whose name is " + name + " and age " + age + " " + " is pursuing their degree " + degree);	
	}
}