package JAVA_PRACTICE_W3.Encapsulation_Practice;

//class declaration
public class Employee {
//declare non-static private members
	private String name;
	private String location;
	private int salary;
	private int experience;
	private String education;

//create constructor to call non-static members
public Employee(String name, String location, int salary, int experience, String education) {
	this.name=name;
	this.location=location;
	this.salary=salary;
	this.experience=experience;
	this.education=education;
}


private String ValidEducation(String education) {
	
	if(education.equals("btech") || education.equals("mtech") || education.equals("degree")) {
		return education;
	} else {
		return "unknown";
	}
}

public void display() {
	System.out.println(name);
	System.out.println(salary);
	System.out.println(location);
	System.out.println(experience);
	System.out.println(education);
}

public static void main(String[] args) {
	Employee e1 = new Employee("jess", "hyderabad", 10000, 3, "B.Arch");
	e1.display();
	Employee e2 = new Employee("Shiva Sai", "hyderabad", 20000, 4, "B.Tech");
	e2.display();
	}
}