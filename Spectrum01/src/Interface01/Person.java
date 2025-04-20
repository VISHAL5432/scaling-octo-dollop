package Interface01;

public class Person {
	private String name;
	private int age;
	private String addr;
	
	public Person() {
		System.out.println("Person Default Constr. ");
	}
	 
	public Person(String name, int age, String addr) {
	 
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("Person 3 Param. Constr. ");
	}
}
