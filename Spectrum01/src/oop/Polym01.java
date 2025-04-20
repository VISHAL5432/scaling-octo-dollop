package oop;

public class Polym01 {
	public void add() {
		int a =32, b=23;
		int c = a+b;
		System.out.println("Addition of and b is : "+c);
	}
	public void add(int a ,int b) {
		int c = a+b;
		System.out.println("Addition of and b is : "+c);
	}
	public void add(double a, double b) {
		double c = a+b;
		System.out.println("Addition of and b is : "+c);
	}
	public void add(String name, int age, String num) {
		System.out.println("Details of a person : ");
		System.out.println("Nmae : "+name+ " , " + "Age : "+age+ " , "+ "num : "+num);
	}
	public static void main(String[] args) {
		 Polym01 p = new Polym01();
		 p.add();
		 p.add(23,34);
		 p.add(22.5,34.5);
		 p.add("Vishal", 23, "+91 7739302475");
				 

	}

}
