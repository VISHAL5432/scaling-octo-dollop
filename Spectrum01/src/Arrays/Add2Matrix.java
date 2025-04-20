package Arrays;

public class Add2Matrix {
	public static void main(String[] args) {
		
	// Substract two 
	int x[][]= {{2,3,4},{5,6,7}};
	int y[][]= {{5,4,3},{7,6,8}};
	 for(int i=0; i<x.length; i++) {
		 for(int j= 0;j<x[0].length;j++) {
			 System.out.print(y[i][j] - x[i][j]+ " ");
		 }
		 System.out.println();
	 }
      }
	}
