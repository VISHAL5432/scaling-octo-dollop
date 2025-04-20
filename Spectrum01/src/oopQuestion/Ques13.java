package oopQuestion;
public class Ques13 {
	public static void main(String[] args) {
		 String ss = "i 15 s25 a 20string";
		 int s = ss.length();
		 int num = 0;
		 System.out.println(s);
		 int sum=0;
		 for(int i =0; i<=s; i++) {
			 if(i==num) {
				 sum +=i;
			 }
		 }
		 System.out.println("Sum of digits : "+sum);
	}
}
