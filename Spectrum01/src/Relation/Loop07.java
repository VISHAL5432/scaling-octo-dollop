package Relation;

public class Loop07 {

	public static void main(String[] args) {
		 int as = 34567289;
		 int count = 0;
		 while(as!= 0) {
			 as /= 10;
			 ++count;
		 }
		 System.out.println(" Digit Count = "+ count);
	}

}
