package Arrays;

public class Array2D_Q18 {

	public static void main(String[] args) {
		 int a1[][]= {{1,2,3,4},{5,6,7,8}};
		 int a2[][]= {{1,2,3,4},{5,6,7,8}};
		 for(int i=0; i<a1.length;i++) {
			 for(int j=0;j<a1[0].length;j++) {
				 if(a1[i][j]==a2[i][j]) {
					  System.out.println("True");
				 }
				 else {
					 System.out.print(" False");
				 }
			 }
			 
		 }
	}

}
