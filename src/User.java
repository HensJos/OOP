
public class User {
	protected String name;
	protected String email;
	protected int salary;
	protected boolean isAdmin;
	protected String telNumber;
	
	public User(String name) {
		this.name = name;
	}
	
	public void checkAdminRights() {
		if (isAdmin == true) {
			System.out.println("You have admin rights.");
		} else {
			System.out.println("You have NO admin rights.");
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (isAdmin == true) {
			this.salary = salary;
		}
		else {
			System.out.println("You trying to change your own salary, " + name + "?");
		}
	}	
}
