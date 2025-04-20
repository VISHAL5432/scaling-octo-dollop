package Arrays;
import java.util.Arrays;
public class ArrayStringSort {

	public static void main(String[] args) {
		 int arr[]={123,124,121,223,445,666,7765,323,66675,12};
		 String str[] = {"Java","C++","C programing","Python", "JavaScript"};
		 System.out.println("Original Array : "+Arrays.toString(arr));
		 Arrays.sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		System.out.println("Original String Array : "+ Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("Sorted String Array : "+ Arrays.toString(str));
	}

}
