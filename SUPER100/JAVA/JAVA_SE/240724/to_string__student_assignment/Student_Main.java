package to_string__student_assignment;

public class Student_Main {
	public static void main(String[] args) {
		Student student1 = new Student(11, "jesse", 25, "bachelor of architecture");
		student1.toString();
		System.out.println(student1.toString());
		
		Student student2 = new Student(7, "blueberry", 26, "bachelor of architecture");
		student2.toString();
		System.out.println(student2.toString());
	}
}
