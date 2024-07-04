package approach_1_programming;

public class Student {
	//static variables
	private String SchoolName = "St. Joseph's Public School";
	//non-static variables
	private String first_name;
	private String last_name;	
	private double science_marks;
	private double math_marks;
	private double social_marks;
	
	//constructor to call non-static variables
	public Student(String first_name, String last_name, double science_marks, double math_marks, double social_marks) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.science_marks=science_marks;
		this.math_marks=math_marks;
		this.social_marks=social_marks;
	}
	
	//calculate average marks for each student
	public double avg_marks() {
		return (science_marks + math_marks + social_marks) / 3;
	}
	
	//display all the details
	public void display_details() {
		System.out.println("\n");
		System.out.println("Student name: " + first_name + " " + last_name);
		System.out.println("School name: " + SchoolName);
		System.out.println("Science marks: " + science_marks);
		System.out.println("Math marks: " + math_marks);
		System.out.println("Social marks: " + social_marks);
		
		System.out.println("Average marks: " + avg_marks());
	}
}

