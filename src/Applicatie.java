
public class Applicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Heinrich", true);
		Employee emp2 = new Employee("Helmut", true);
		FinancialUser fin = new FinancialUser("Anton", true);
		
		System.out.println(emp.name + " " + emp.isAdmin);
		System.out.println(emp2.name + " " + emp2.isAdmin);
		System.out.println(fin.name + " " + fin.isAdmin);
	}

}
