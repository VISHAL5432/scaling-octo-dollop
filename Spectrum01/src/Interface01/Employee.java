package Interface01;

public class Employee extends Person{
	private String designation;
	private double salary;
	
	public Employee() {
		super();
		System.out.println("Employee Default Constr");
		
	}

	public Employee( String name, int age, String addr,String designation, double salary) {
		super(name,age,addr);
		this.designation = designation;
		this.salary = salary;
		System.out.println("Employee 5 - par Constructor ");
	}
	
}
