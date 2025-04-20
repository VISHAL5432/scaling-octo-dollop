package Relation;
import java.util.Scanner;
public class Loop19 {

	public static void main(String[] args) {
		Scanner inp = new Scanner (System.in);
		System.out.print("Enter the num : ");
		 int n =inp.nextInt();
		 int  fact = 0;
		for(int i =1; i<=5; i++) {
			if(n%i == 0) {
				fact++;
			}
		}
		if(fact == 2) {
			System.out.println("Given num is prime number  : "+n);
		}
		else {
			System.out.println("Not a prime number : "+n);
		}
		inp.close();
	}

}
