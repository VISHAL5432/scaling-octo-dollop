package MultiThreading_01;

public class TestAc  extends Thread{
 public static Account acc  = new Account();
 private String name ;
 
 public TestAc(String name) {
	 this.name = name;
 }
 public void run() {
	 for(double i=1; i<=5;i++) {
		 acc.deposite(name, 10000);
	 }
 }
	public static void main(String[] args) {
		TestAc t1 = new TestAc("Radhika");
		TestAc t2 = new TestAc("Mohan");
		
		t1.start();
		t2.start();

	}
 
  
}
