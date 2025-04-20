 package oop.Java.Class;

public class Account1 {
  private String acNum;
  private String acType;
  private double balance;
  /** this is new doc info */
public String getAcNum() {
	return acNum;
}
public void setAcNum(String acNum) {
	this.acNum = acNum;
}
public String getAcType() {
	return acType;
}
public void setAcType(String acType) {
	this.acType = acType;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
  public void deposite(double amount) {
	  double bal = getBalance();
	  setBalance(bal+amount);
	  System.out.println(acNum + "Amount deposited Succesfully now your balance is :  " +getBalance());
  }
  public void withdrawl(double amount) {
	  double bal = getBalance();
	  if(bal >= amount) {
		  setBalance(bal - amount);
		  System.out.println(acNum + "Amount Withdrawl Succesfully now your balance is :  " +getBalance());
	  }
	  else { 
		  System.out.println("You hava insuffecient Balance in your Account : " +getBalance());
	  }
	  }
	 public void fundTransfer(Account1 ac, double amount) {
		 double selfBal = getBalance();
		 double toBal = getBalance();
		 if(selfBal >= amount) {
			 setBalance(selfBal - amount);
			 ac.setBalance(toBal+amount);
			 System.out.println("Transection Successful");
		 }
		 else {
			 System.out.println("Transection Failed Due To Insufficient Balance : "+getBalance());
		 }
	 }
  
}
