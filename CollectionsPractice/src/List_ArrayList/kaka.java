package List_ArrayList;

import java.util.Scanner;

public class kaka {

	public void create() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name :");
		String name  = sc.nextLine();
		
		System.out.println("-------Create account-------");
		System.out.println("your name"+name);
	}

	public void show() {

	}
	public static void main(String[] args) {
		kaka ka  = new kaka();
		Scanner sm = new Scanner(System.in);
		int choice = 0;
		 do {
			 System.out.println("1.Create Account");
			 choice = sm.nextInt();
			 switch(choice) {
			 case  1: ka.create();
			 break;
			 default : System.out.println("invalid number");
				 
			 }
		 }while(choice!=5);
	}
	
}
