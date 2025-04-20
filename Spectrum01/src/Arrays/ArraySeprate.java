package Arrays;

public class ArraySeprate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aw[] = {22,23,24,25,21,12,13};
		int evenCount=0;
		int oddCount=0;
		int a[]=new int [evenCount];
		int b[]= new int [oddCount];
		int z = aw.length;
		for(int i=0;i<z-1; i++) {
			if(aw[i]%2==0) {
				  a[evenCount]+= i;
				 a[evenCount]++;
				System.out.println(a[evenCount]);
			}
			else {
				 b[oddCount]+= i;
				 b[oddCount]++;
				 System.out.println(b[oddCount]);
			}
			
		}
		System.out.println();
	}

}
