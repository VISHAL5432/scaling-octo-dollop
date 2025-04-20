package oopQuestion;

public class Person01 {
	private String name;
	private int age;
	public Person01(String n, int a) {
		name = n;
		age = a;
	}
	void display() {
		System.out.println(name + " "+ age);
	}
	public static void main(String[] args) {
		Person01 p1 = new Person01("Vishal Singh", 23);
		Person01 p2 = new Person01("Mohan Singh",22);
		p1.display();
		p2.display();

	}

}
