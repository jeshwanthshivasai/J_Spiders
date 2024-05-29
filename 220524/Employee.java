class Employee {
	public String name;
	public String location;
	public String role;
	public double experience;
	public double salary;

	public void display() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(role);
		System.out.println(experience);
		System.out.println(salary);
	}
	public Employee(String name, String location, String role, double experience, double salary) {
		this.name = name;
		this.location = location;
		this.role = role;
		this.experience = experience;
		this.salary = salary;
	}
}