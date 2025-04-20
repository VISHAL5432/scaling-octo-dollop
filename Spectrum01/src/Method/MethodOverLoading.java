package Method;

public class MethodOverLoading {

	public static int plusMethod(int a, int b) {
		return a+b;
	}
	public static double plusMethod(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		 
		int num1 = plusMethod(7,9);
		double num2 = plusMethod(12.2, 12.3);
		System.out.println(num1);
		System.out.println(num2);
	}

}
