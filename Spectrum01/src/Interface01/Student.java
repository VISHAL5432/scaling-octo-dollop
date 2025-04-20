package Interface01;

public class Student extends Person01 implements RichMan,SocialWorker {
	private String roll_num;
	private int age;
	 private int marks;
	public String getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(String roll_num) {
		this.roll_num = roll_num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void helpToOthers() {
		 System.out.println("Distributes books and clothes in helpLess peoples!");
		
	}
	@Override
	public void earnMoney() {
		 System.out.println("Earn some money about 40k by diong some parttime !");
		
	}
	@Override
	public void party() {
	 System.out.println("Gives samosha party to their friends!"); 
		
	}
	@Override
	public void donation() {
		 System.out.println("donates 1k for the public walfare !");
		
	}
	public int getmarks() {
		return marks;
	}
	public void setmarks(int setMrks) {
		this.marks = setMrks;
	}
	
}
