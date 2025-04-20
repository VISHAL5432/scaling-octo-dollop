package Arrays;

import java.util.Arrays;

public class ArrayDescending09 {

	public static void main(String[] args) {
		int arr[] = {23,45,33,22,12,21,52,3};
		int n =arr.length;
		System.out.print(" Unordered array : ");
		for(int i=0; i<=arr.length-1;i++) {
		System.out.print(arr[i]+ ",");
		
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.print("  Descending order array : ");
		for(int i = n-1; i>=0; i--) {
		System.out.print(arr[i]+ ",");
		}

	}

}
