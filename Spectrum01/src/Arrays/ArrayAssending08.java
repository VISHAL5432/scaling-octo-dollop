package Arrays;
import java.util.Arrays;
public class ArrayAssending08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,45,33,22,12,21,52,3};
		System.out.print(" Unsorted array : ");
		for(int i=0; i<=arr.length-1;i++) {
		System.out.print(arr[i]+ ",");
		
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.print(" Ascending order array : ");
		for(int i = 0; i<=arr.length-1; i++) {
		System.out.print(arr[i]+ ",");
		}
	}

}
