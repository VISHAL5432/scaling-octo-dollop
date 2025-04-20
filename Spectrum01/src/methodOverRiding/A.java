package methodOverRiding;

public abstract class A {
		public abstract void hello(); 
		
		public static void main(String[] args) {
			A a = new C();
			B b = new C();
			b.hi();
			a.hello();
		}
	}
	abstract class B extends A {
		public abstract void hi();
	}
	class C extends B{
		
		public void hi() {
			System.out.println("hi from B - in C");
			
		}
		public void hello() {
			System.out.println("Hello from A - in C");
		}
	}


 
