package HashSet_;

import java.util.ArrayList;

public class TestStu {
// using toString method
	public static void main(String[] args) {
		 Student s1 = new Student("Mohan",23,"1077CS345",2345);
		 Student s2 = new Student("Sohan",24,"1077CS345",2345);
		 Student s3 = new Student("Rohan",25,"1077CS345",2345);
		 Student s4 = new Student("Sohani",63,"1077CS345",2345);
		 Student s5 = new Student("Aman",27,"1077CS345",2345);
		 Student s6 = new Student("Sadhu",43,"1077CS345",2345);
		 Student s7 = new Student("Dhumru",53,"1077CS345",2345);
		 ArrayList<Student> li = new ArrayList<>();
		 li.add(s1);
		 li.add(s2);
		 li.add(s3);
		 li.add(s4);
		 li.add(s5);
		 li.add(s6);
		 li.add(s7);
		 System.out.println("NAME \t\t AGE \t ROLL NO \t MARKS\n-----------------------");
		 for(Student ss:li) {
			 System.out.println(ss);
		 }
	}

}
