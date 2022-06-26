package employee;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeTest {

	public static void main(String[] args) {
//		LocalDate birthday = null;
//		String s = birthday.toString();	//java.lang.NullPointerException
//		
		
		Employee[] staff = new Employee[4];
		
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		staff[3] = new Employee(null, 18000, 1999, 7, 30);
		
		for (Employee e : staff) {
			e.raiseSalary(5);
		}
		
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
		}
		
		staff[3].getName();
	}

}

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
//		name = Objects.requireNonNullElse(n, "unknown");
//		Objects.requireNonNull(n);
//		Objects.requireNonNull(n, "The name cannot be null");
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}