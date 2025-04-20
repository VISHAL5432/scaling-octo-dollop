package Relation;

public class Loop05 {

	public static void main(String[] args) {
		 int sum = 0;
		 int n =10;
		 System.out.print("Odd Natural num :" );
		 for(int i=1; i<=n; i++) {
			
			 if(i%2!= 0) {
				 System.out.print(i+",");
				 sum +=i;
			 }
		 }
		System.out.println();
		 System.out.println(" Sum 0f odd natural num : " + sum);

	}

}
