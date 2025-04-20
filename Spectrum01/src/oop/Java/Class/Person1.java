package oop.Java.Class;

public class Person1 {

	public static void main(String[] args) {
//		 PersonClass ram = new PersonClass();
//		 ram.nameKaran("Mohan");
//		 ram.ageRakho(34);
//		 ram.mobileNum("+91 9897766543");
//		 ram.addressLikho("Mathura");
//		 System.out.println("Mohan Details : ");
//		  String m =ram.namePao();
//		  int w = ram.agePao();
//		  String d = ram.mobilePao();
//		  String f = ram.addresspao();
//		  System.out.println(m+ "- "+ w + "- "+ d + "- " + f+"");
		PersonClass p1 = new PersonClass();
		p1.setName("Madhav");
		p1.setAge(12);
		p1.setMobile("+91 9897765443");
		p1.setAddress("In my Heart!");
		System.out.println("P1 Details : ");
		 String p = p1.getName();
		int a = p1.getAge();
		String mo = p1.getMobile();
		String ad = p1.getAddress();
		System.out.println(p+" " + a+ " " + mo + " " + ad + " " );
		
	}

}
