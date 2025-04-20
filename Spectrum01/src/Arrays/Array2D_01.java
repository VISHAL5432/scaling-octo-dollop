package Arrays;

public class Array2D_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{5,7,8,9},
					  {10,12,15,18},
					  {17,28,30,5}
						};
		for(int[]row:arr) {
			for(int elem:row) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	}

}
