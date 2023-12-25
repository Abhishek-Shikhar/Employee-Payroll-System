package max;

public class Main {

	public static void main(String[] args) {
		PayRollSystem payrollSystem = new PayRollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("Rahul", 1, 70000.0);
		PartTimeEmployee emp2 = new PartTimeEmployee("Vikas",  2, 40, 100);
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		System.out.println("Initial Employee Deatails: ");
		payrollSystem.displayEmployee();
		System.out.println("Remove Employee");
		payrollSystem.removeEmployee( 2);
		System.out.println("Remaining Employee Deatils: ");
		payrollSystem.displayEmployee();

	}

}
