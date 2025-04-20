package InterviewQues;

public class RotateArrKelement {

	public static void main(String[] args) {
		 int arr[]= {2,3,4,5,6,7,8,9};
		 int k = 2;
		 int l = arr.length;
		 int rotatearr[]=new int [l];
		 for(int i=0;i<l;i++) {
		 rotatearr[(i+k)%l]=arr[i];
		 }
		 for(int i =0; i<=l-1;i++) {
				 System.out.print(rotatearr[i]+ ",");
			 }
		 
		 }
		 
		 
	}


