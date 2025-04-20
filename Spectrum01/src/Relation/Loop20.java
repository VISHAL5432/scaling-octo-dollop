package Relation;

public class Loop20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		if(n<=1) {
			System.out.println(" num is not applicable ");
		}
		//System.out.println("Not a prime num : ");
		
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				System.out.print(i+",");
			}
			else {
				System.out.print(i+",");
				//System.out.println("Num is prime num : ");
			}
		}
		System.out.println("Num is prime num : ");
		System.out.println();
	}

}
