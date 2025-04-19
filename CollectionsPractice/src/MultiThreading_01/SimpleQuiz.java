package MultiThreading_01;

import java.util.Scanner;

public class SimpleQuiz {
	public static void pouse(int s ) {
		try {
			Thread.sleep(1000 * s);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("************* Welcome To KBC ***************");
		pouse(2);
		System.out.println("Mera Name Hai Chota Don");
		pouse(1);
		System.out.println("Aur app Khel Rahe Hai Mind Ka Khel Season 123");
		pouse(2);
		System.out.println("First Question for You....");
		pouse(2);
		System.out.println("Q1. What is IST ?");
		pouse(2);
		System.out.println("Your Options Are : ");
		pouse(2);
		System.out.println("a. Indori Style Time  \t  b. Indian Standerd Time  \t  c. Iran Standerd Time "
				+ " \t  d. Non of these ");
		String qa = sc.next();
		pouse(2);
		
		if (qa.equalsIgnoreCase("b")) {
			System.out.println("Correct Answer");
			pouse(1);
			System.out.println("");
		}
	}

}
