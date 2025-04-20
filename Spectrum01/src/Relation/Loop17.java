package Relation;

public class Loop17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int factorial =1;
		System.out.print("Factorial of given num : "+n +" = ");
		for(int i =1; i<=n;i++) {
			factorial *=i;
		}
		System.out.println(factorial);
	}

}
