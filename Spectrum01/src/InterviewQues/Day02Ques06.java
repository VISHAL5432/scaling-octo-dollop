package InterviewQues;

public class Day02Ques06 {
//	public static void zigZag(int n) {
//		int num = 1;
//		for(int i=0;i<=n-1;i++) {
//			if(i%2==0) {
//				for(int j= 0;j<=n-1;j++) {
//					System.out.print(num++ + " ");
//				}
//			}else {
//			int temp = num + n-1;
//			for(int j =0; j<=n-1; j++) {
//				System.out.print(temp-- + " ");
//			}
//			num +=n;
//		}
//			System.out.println();
//			}
//	}
//	public static void main(String[] args) {
//		 int n =4;
//		 zigZag(n);
//	
//	 
//		
//	}
//
	public static void main(String[] args) {
		 int arr[][] =new int [4][4];
		 int n = 4;
		 int count =1;
		 for(int i =0; i<n;i++) {
			 if(i%2==0) {
				 for(int j=0;j<n ;j++) {
					 arr[i][j]=count++;
				 }
			 }
			 else {
				 for(int j=3;j>=0;j--) {
					 arr[i][j]=count++;
				 }
			 }
		 }
		 for(int[] row:arr) {
			 for(int num:row) {
				 System.out.print(num+" ");
			 }
		 System.out.println();
		 }
	}

}


