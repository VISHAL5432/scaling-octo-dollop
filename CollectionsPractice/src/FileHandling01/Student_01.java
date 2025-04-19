package FileHandling01;

import java.io.Serializable;

public class Student_01 implements Serializable {
	private String name ;
	private String rollno;
	private int age;
	private String address;
	private transient String temp;
	
	public Student_01() {
		
	}

	public Student_01(String name, String rollno, int age, String address, String temp) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.address = address;
		this.temp = temp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}
	
}
