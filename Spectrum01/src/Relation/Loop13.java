package Relation;

import java.util.Scanner;
 
	public final class Loop13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number : ");
		int rem , rev =0;
		try (Scanner input = new Scanner(System.in)) {
			int num = input.nextInt();
			while(num > 0) {
				rem = num %10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
		}
		System.out.println();
		System.out.println("Reversed num : "+ rev);
	}

}
