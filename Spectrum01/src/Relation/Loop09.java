package Relation;

public class Loop09 {

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
		 int sum = firstDigit + lastDigit;
		 int sub = firstDigit - lastDigit;
		 int mul = firstDigit * lastDigit;
		 int div = firstDigit / lastDigit;
		 System.out.println("Sum : "+ sum);
		 System.out.println("Sub : "+ sub);
		 System.out.println("mult : "+ mul);
		 System.out.println("Div : "+ div);
	}

}
