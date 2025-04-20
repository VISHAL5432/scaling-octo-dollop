package Arrays;
	import java.util.Arrays;
public class ArrayMinMax06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,2,3,43,4,55,6,5};
		Arrays.sort(arr);
		int min = 0, max =0;
		int n = arr.length;
		 
		min= arr[0];
		max=arr[n-1];  
		System.out.println("Min value : "+min);
		System.out.println("Max value : "+max);
	}

}
