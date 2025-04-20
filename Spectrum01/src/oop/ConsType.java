package oop;

public class ConsType {

	 
		 private String name;
		 private int age;
		 private String mobile;
		 private String address;
		 
		public ConsType() {
			System.out.println("Person Default Constructor :");
		}
		public ConsType(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println("2 argument Constructor :");
		}
		public ConsType(String name, int age, String mobile,String address) {
//			this.name = name;
//			this.age = age;
			this(name,age);
//			this.mobile = mobile;
//			this.address = address;
			System.out.println("4 argument Constructor : ");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	

}
