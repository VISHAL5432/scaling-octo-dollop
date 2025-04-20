package Method;

public class VarArgs_Method {
	
//	static void display(String... values) {
//		System.out.println("Display method invoked");
//	}
//	public static void main(String[] args) {
//		display();
//		display("my","name","is", "varArgs");
//		 
//
//	}
	static void display(String... value) {
		System.out.println("Display method invoked");
		for(String s:value) {
			System.out.println(s);
		}
	}
	public static void main(String args[]) {
		display();
		display("hello ");
		display("My", "name","is","VarArgs");
		
	}

}
