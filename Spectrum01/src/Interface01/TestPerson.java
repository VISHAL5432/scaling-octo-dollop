package Interface01;

public class TestPerson {
 public static void main(String[] args) {
	RichMan rm = new Student();
	rm.earnMoney();
	rm.party();
	rm.donation();
	System.out.println("---------------------");
	
	SocialWorker sw = new Student();
	sw.helpToOthers();
	System.out.println("----------------------");
	
	RichMan rb = new BussinessMan();
	rb.earnMoney();
	rb.party();
	rb.donation();
	System.out.println("-------------------------------");
	
	SocialWorker sb = new BussinessMan();
	sb.helpToOthers();
	System.out.println("---------------------------");
	
	SocialWorker st =new Teacher01();
	st.helpToOthers();
	System.out.println("------------------------------");
	
	
	
	Student stu =new Student();
	stu.setName("Sanju Dada!");
	stu.setAge(23);
	stu.setRoll_num("0177CS201180");
	stu.setAddress("ARA( BHOJPUR) BIHAR ");
	stu.setmarks(396);
	System.out.println(stu.getName()+"-"+stu.getAge()+"-"+stu.getRoll_num()+"-"+ stu.getAddress()+"-"+stu.getmarks());
 }
}
