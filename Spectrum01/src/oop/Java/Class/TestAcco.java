package oop.Java.Class;

public class TestAcco {

	public static void main(String[] args) {
		 Account1 sanjana = new Account1();
		 sanjana.setAcNum("s1234");
		 sanjana.setAcType("Saving");
		 sanjana.setBalance(5000);		
		 
		 Account1 vishu = new Account1();
		 vishu.setAcNum("v12345");
		 vishu.setAcType("Current");
		 vishu.setBalance(2000);
		 System.out.println("Sanjana Account Details : ");
		 System.out.println(sanjana.getAcNum()+" "+ sanjana.getAcType()+" "+ sanjana.getBalance());
		 System.out.println("Vishu Account Details : ");
		 System.out.println(vishu.getAcNum()+" "+vishu.getAcType()+" "+vishu.getBalance());
	
		 sanjana.deposite(12000);
		 vishu.deposite( 15000);
		 
		 sanjana.withdrawl(2200);
		 vishu.withdrawl(1200);
		 
		 vishu.fundTransfer(sanjana,500);
		 System.out.println("Sanjana s1234 Balance : "+sanjana.getBalance());
		 System.out.println("Vishu v12345 Balance : "+vishu.getBalance());
	}	
	

}
