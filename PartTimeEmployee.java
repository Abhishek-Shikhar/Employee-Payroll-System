package max;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hoursRate;
	
	public PartTimeEmployee(String name, int id, int hoursWorked, double hoursRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hoursRate = hoursRate;	
	}
	public double calculateSalary() {
		return hoursWorked*hoursRate;
	}
	
}
