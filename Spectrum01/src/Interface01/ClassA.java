package Interface01;
	// implicit call of base class constructor
public class ClassA { 
	 public ClassA() {
	
	 System.out.println("This is Class B ");
	 }
}
class B extends ClassA{
	public B(int x) {
		super();
		System.out.println("This is Class B ");
	}
	public static void main(String[] args) {
		B b = new B(6);
	}
}
