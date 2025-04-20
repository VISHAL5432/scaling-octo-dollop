package Arrays;

import java.util.Arrays;

public class ArrayLargAndSmall11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {12,33,22,66,77,13};
		int a= ar.length;
		Arrays.sort(ar);
		System.out.println("Smallest value : "+ar[0]);
		System.out.println("Largest value : "+ar[a-1]);
	}

}
