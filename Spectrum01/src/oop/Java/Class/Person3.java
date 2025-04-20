package oop.Java.Class;

import java.util.Date;

public class Person3 {

	public static void main(String[] args) {
		Date dt = new Date();
		dt.setDate(25);
		dt.setMonth(01);
		dt.setYear(2002);
		
		Person2 ram = new Person2 ();
		ram.setName("Raghav!");
		ram.setDob(dt);
		ram.setAddress("Bhojpur");
		System.out.println(ram.getName()+" "+ram.getAvgAge()+" "+ram.getAddress());
		System.out.println(ram.getDob());

	}

}
