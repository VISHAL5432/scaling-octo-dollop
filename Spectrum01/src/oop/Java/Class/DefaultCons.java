
package oop.Java.Class;

public class DefaultCons {

		int id; 
		String name;
		void display() {
			System.out.println(id + " " + name);
		}
	public static void main(String[] args) {
		 DefaultCons det = new DefaultCons();
		 DefaultCons det2 = new DefaultCons();
		 det.display();
		 det.display();

	}

}
