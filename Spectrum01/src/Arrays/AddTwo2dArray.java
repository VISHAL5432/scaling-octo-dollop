package Arrays;

public class AddTwo2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{5,7,8,9},{10,12,15,18},{17,28,30,5}};
		int arr2[][]= {{8,15,6,8},{9,8,3,9},{12,7,5,10}};
		int[][]result =new int [arr1.length][arr2[0].length];
		
		for(int i=0; i< arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				result [i][j]=arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("Resultant Array");
		 for(int []row:result) {
			 for(int element:row) {
				 System.out.print(element + " ");
			 }
			 System.out.println();
		 }
	}

}
