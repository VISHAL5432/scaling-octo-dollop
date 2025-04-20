package oop.Java.Class;

public class ParaCons {
	int id;
	String name;
	int age;
	void display() {
		System.out.println( id + " "+name+ " "+ age);
	}
	public ParaCons(int a,String b, int ag) {
		 id = a;
		 name = b;
		 age = ag;
	 }
	public static void main(String[] args) {
		ParaCons pa = new ParaCons(11223311,"Mohan Singh",23);
		pa.display();

	}

}
