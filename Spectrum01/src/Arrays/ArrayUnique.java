package Arrays;
 
import java.util.*;
public class ArrayUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,12,43,34,65,56};
		int rr = arr.length;
		Arrays.sort(arr);
		System.out.println("min value :" +arr[0]+"\n" + "Max value :" +arr[rr-1]);
	}

}
