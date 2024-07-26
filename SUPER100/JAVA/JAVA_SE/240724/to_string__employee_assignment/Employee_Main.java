package to_string__employee_assignment;

public class Employee_Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee(11, "jesse", 90000);
		
		Employee employee2 = new Employee(07, "blueberry", 10000);
		
		printEmployeeDetails(employee1);
		printEmployeeDetails(employee2);
		
		}
	private static void printEmployeeDetails(Employee employee) {
		if(employee.salary > 10000) {
			System.out.println(employee.toString());
		}
		if(employee.salary == 15000) {
			System.out.println(employee.toString());
		}
		
	}
}
