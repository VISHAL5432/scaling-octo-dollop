package Relation;

public class Loop08 {

	public static void main(String[] args) {
		 int a = 2345654;
		 int firstDigit;
		 int lastDigit;
		 lastDigit = a%10;
		 System.out.println("lastDigit = "+lastDigit);
		 while(a>10) {
			a = a / 10;
		 }
		 firstDigit=a;
		 System.out.println("First Digit = "+firstDigit);
	}

}
