package Arrays;

import java.util.Arrays;

public class ArayMergeArray13 {

	public static void main(String[] args) {
		 int a []= {2,3,4,5,6,76};
		 int b[]= {8,7,6,9,44,33,22};
		 int n =a.length;
		 int m =b.length;
		 int c1 = n+m;
		 int c []= new int [c1];
		 
		 System.arraycopy(a, 0, c, 0, n);
		 System.arraycopy(b, 0, c, n, m);
		 System.out.println(Arrays.toString(c));
		 Arrays.sort(c);
		//   System.out.println(c[0,n]);
	}

}
