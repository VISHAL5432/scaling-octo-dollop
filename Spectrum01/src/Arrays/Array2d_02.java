package Arrays;

public class Array2d_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]= {{2,3,4},{5,6,7}};
		int y[][]= {{5,4,3},{7,6,5}};
		
//		for(int i[] : x) {
//			for(int j : i) {
//				System.out.print(j+" ");
//				
//		}
//			System.out.println();
//	}
		//int r[][]= new int [3][2]
		for(int i=0; i<x.length;i++) {
			for(int j=0; j<y[0].length;j++) {
				System.out.print(x[i][j] + y[i][j] + " ");
			}
			System.out.println();
		}
}
} 
