package HashSet_;

public class Student {
  private String name;
  private int age;
  private String rollnum;
  private double salary;
  
  
  @Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", rollnum=" + rollnum + ", salary=" + salary + "]";
}


public Student() {
	  
  }
  
  
public Student(String name, int age, String rollnum, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.rollnum = rollnum;
	this.salary = salary;
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
public String getRollnum() {
	return rollnum;
}
public void setRollnum(String rollnum) {
	this.rollnum = rollnum;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
  

}
