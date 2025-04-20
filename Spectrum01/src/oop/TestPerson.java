package oop;

public class TestPerson {

	public static void main(String[] args) {
		 Student st = new Student();
		 st.setName("Mohan lal");
		 st.setAge(23);
		 st.setRoll("0177cs201180");
		 st.setColor("Fairy");
		 st.setMarks(396);
		 System.out.println("Mohan Details ---");
		 System.out.println(st.getName()+" "+ st.getAge()+" "+st.getRoll());
		 System.out.println(st.getColor()+" "+st.getMarks());
		 System.out.println("--------------------------------");
		 BussinessMan bs = new BussinessMan();
		 bs.setName("Virat Pratap Singh");
		 bs.setAge(24);
		 bs.setColor("Shadow Black");
		 bs.setBusiness("Import Export!");
		 System.out.println("Virat Details ----");
		 System.out.println(bs.getName()+" "+bs.getAge());
		 System.out.println(bs.getBusiness()+" "+bs.getColor());
		 System.out.println("-----------------------------------");
		 Engineer er = new Engineer();
		 er.setName("Vishu Kumar Singh");
		 er.setAge(23);
		 er.setColor("Fairy Brown");
		 er.setStream("Computer Science Engineer !");
		 System.out.println("Vishu Details ---");
		 System.out.println(er.getName()+" "+er.getAge());
		 System.out.println(er.getStream()+" "+er.getColor());
	}

}
