package approach_1_programming;

public class MainClass {
	public static void main(String[] args) {
		
		//creating student objects
		Student s1 = new Student("Pink", "Panther", 30.5, 40, 89);
		Student s2 = new Student("Tom", "Cat", 80, 40.1, 79.7);
		Student s3 = new Student("Chitti", "Robot", 67, 89, 65);
		
		//displaying all the details
		s1.display_details();
		s2.display_details();
		s3.display_details();
	}
}