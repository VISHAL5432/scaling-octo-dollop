package InterviewQues;

public class Day02Ques02 {

	public static void main(String[] args) {
		int n= 8;
	 int ar[][]=new int [n][n];
	 int val=1,minRow=0,maxRow=n-1,minCol=0,maxCol=n-1;
	 while(val<=n*n) {
		 for(int i=minCol;i<=maxCol;i++) {
			 ar[minRow][i]=val++;
					 }
		 minRow++;
		 for(int i=minRow;i<=maxRow;i++) {
			 ar[i][maxCol]=val++;
		 }
		 maxCol--;
		 for(int i=maxCol; i>=minCol;i--) {
			 ar[maxRow][i]=val++;
		 }
		 maxRow--;
		 for(int i=maxRow;i>=minRow;i--) {
			 ar[i][minCol] = val++; 
		 }minCol++;
	 }
	 for(int[]row:ar) {
		 for(int num:row) {
			 System.out.print(num+" ");
		 }
		 System.out.println();
	 }
	}

}
