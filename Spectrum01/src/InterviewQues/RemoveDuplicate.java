package InterviewQues;
import java.util.Arrays;
public class RemoveDuplicate {
	public static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            res[k++] = a[i] <= b[j] ? a[i++] : b[j++];
        while (i < a.length) res[k++] = a[i++];
        while (j < b.length) res[k++] = b[j++];
        return res;
    }
	public static void main(String[] args) {
		 int a[]= {2,3,4,5,6,7};
		 int b[]= {8,9,10,11,12,13,14};
		 System.out.println(Arrays.toString(merge(a, b)));
		 

	}

}
