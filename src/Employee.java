
public class Employee extends User {
	
	public Employee(String name, boolean isAdmin) {
		super(name);
	}
	
	public void setSalary(int salary, FinancialUser fin) {
		if (isAdmin == true || fin != null) {
			this.salary = salary;
		} else {
			System.out.println("You trying to change your own salary, cheaky bastard?");
		}
	}
}
