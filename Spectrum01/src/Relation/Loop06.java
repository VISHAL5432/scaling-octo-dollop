package Relation;

public class Loop06 {

	public static void main(String[] args) {
		 int sum = 0;
		 int n = 50;
		 System.out.print("Even Natural num :" );
		 for(int i=1; i<=n; i++) {
			
			 if(i%2== 0) {
				 System.out.print(i+",");
				 sum +=i;
			 }
		 }
		System.out.println();
		 System.out.println("Sum 0f even natural num : " + sum);


	}

}
