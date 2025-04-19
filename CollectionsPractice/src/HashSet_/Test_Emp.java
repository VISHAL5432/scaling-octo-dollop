package HashSet_;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Emp {
	public static void main(String[] args) {
		
	
	Emp_01 em1 =new Emp_01("Mohan",23,"1077CS345",2345);
	Emp_01 em2 =new Emp_01("Sohan",24,"1077CS344",2341);
	Emp_01 em3 =new Emp_01("Rohan",25,"1077CS346",3452);
	Emp_01 em4 =new Emp_01("Vishal",26,"1077CS347",2348);
	Emp_01 em5 =new Emp_01("Nikhil",27,"1077CS348",4321);
	Emp_01 em6 =new Emp_01("Ansh",28,"1077CS349",5432);
	
	ArrayList<Emp_01> li = new ArrayList<>();
	li.add(em1);
	li.add(em2);
	li.add(em3);
	li.add(em4);
	li.add(em5);
	li.add(em6);
//	System.out.println("Nmae \t Age \t  Id \t\t Salary \n----------------------------------");
	Collections.sort(li, new OrderBYName());
	//Collections.sort(li, new SalaryWise());
	for(Emp_01 en : li) {
		System.out.println(en.getName()+" \t "+en.getAge()+" \t "+en.getId()+" \t "+en.getSalary());
	}
}
}
