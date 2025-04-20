package Arrays;

public class Array01q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6,7,8,89};
		int n = arr.length;
		int sum =0;int  mult = 1; int count = 0;
		for(int i = 0; i<= n -1; i++) {
			sum +=arr[i];
			mult *=arr[i];
			count++;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Mult : "+mult);
		System.out.println("Count : "+count);
	}

}
