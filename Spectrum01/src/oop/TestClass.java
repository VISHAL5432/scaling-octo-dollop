package oop;
// interface usage in inheritance or multiple inheritance in java
	interface A{
		default void methodA() {
			System.out.println("Method A uses Interface A !");
		}
	}
	interface B{
		default void methodB() {
			System.out.println("Method B uses Interface B !");
		}
	}
	
public class TestClass  implements A,B{
	public void myMethod() {
		System.out.println("Method of TestClass !");
	}

	public static void main(String[] args) {
		TestClass ts = new TestClass();
		ts.methodA();
		ts.methodB();
		ts.myMethod();

	}

}
