package MultiThreading_01;

public class Account {
	private double balance;

	public double getBalance() {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(double balance) {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		this.balance = balance;
	}
	 // using simple thread
//	public void deposite(String nm, double amount) {
//		 
//		double bal = getBalance();
//		setBalance(bal + amount);
//		System.out.println(nm + " , Amount Deposited Successfully, now your Balance is : "+getBalance());
//}
	
//	using synchronization method(lock /  monitor)
//	public synchronized  void deposite(String nm, double amount) {
//		
//		double bal = getBalance();
//		setBalance(bal + amount);
//		System.out.println(nm + " , Amount Deposited Successfully, now your Balance is : "+getBalance());
//		
//	}
	//using synchronization block(lock /  monitor)
	public void deposite(String nm, double amount) {
		synchronized(this) {
		double bal = getBalance();
		setBalance(bal + amount);}
		System.out.println(nm + " , Amount Deposited Successfully, now your Balance is : "+getBalance());
		
	}
	
}
