package Constructors;

public class Employee {
	public String name;
	public int id;
	public String designation;
	public int salary;
	public String company_name;
	public int experience;
	public String location;
	public int commission;
	
	public Employee(String name, int id, String designation, int salary, String company_name, int experience, String location, int commission) {
		this.name=name;
		this.id=id;
		this.designation=designation;
		this.salary=salary;
		this.company_name=company_name;
		this.experience=experience;
		this.location=location;
		this.commission=commission;
	}
	
	public Employee(String name, int id, String designation, int salary, String company_name, int experience, String location) {
		this(name, id, designation, salary, company_name, experience, location, 0);
	}
	
	public Employee(String name, int id, String designation, int salary, String company_name, String location, int commission) {
		this(name, id, designation, salary, company_name, 0, location, commission);
		
	}

	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(designation);
		System.out.println(salary);
		System.out.println(company_name);
		System.out.println(experience);
		System.out.println(location);
		System.out.println(commission);
	}
}
