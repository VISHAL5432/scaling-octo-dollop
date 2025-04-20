package InterviewQues;

public class Day02Ques04 {
public static void pPtrangle(int numRow) {
	int [][] tran = new int [numRow][numRow];
	for(int i=0;i<numRow;i++) {
		for(int j =0;j<=i;j++) {
			if(j==0||j==i) {
				tran[i][j]=1;
			}
			else {
				tran[i][j]=tran[i-1][j-1]+tran[i-1][j];
			}
			System.out.print(tran[i][j]+" ");
		}
		System.out.println();
	}
	}
	public static void main(String[]arg) {
		pPtrangle(7);
	}

}