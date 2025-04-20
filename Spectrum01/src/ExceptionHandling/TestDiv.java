package ExceptionHandling;

public class TestDiv {

	public static void main(String[] args) {
		 try {
			 int a,b,c;
			 a=123;
			 b=0;
			 c = a/b;
			 System.out.println("Division Result : " + c);
		 }catch(ArithmeticException v) {
			 System.out.println("Error : Divide by Zero ");
		 }

	}

}
