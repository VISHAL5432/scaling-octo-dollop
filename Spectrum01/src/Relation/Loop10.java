package Relation;

public class Loop10 {

	public static void main(String[] args) {
		int a = 9345654;
		 int firstDigit;
		 int lastDigit;
		 lastDigit = a%10;
		 System.out.println("lastDigit = "+lastDigit);
		 while(a>10) {
			a = a / 10;
		 }
		 firstDigit=a;
		 System.out.println("First Digit = "+firstDigit);
		 int temp =firstDigit;
		 firstDigit =lastDigit;
		 lastDigit = temp;
		 System.out.println("First Digit = "+firstDigit);
		 System.out.println("lastDigit = "+lastDigit);
	}
	

}
