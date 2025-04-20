package InterviewQues;

public class ReversArray {

	public static void printArray(int ar[]) {
		for (int a : ar)
			System.out.print(a + " ");
		System.out.println();
	}

	public static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[] = {7,4, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArray(arr);
		System.out.println("array index of 0 : " + arr[0]);
		reverseArray(arr);
		printArray(arr);
		System.out.println("array index of 0 : " + arr[0]);
	}
}
