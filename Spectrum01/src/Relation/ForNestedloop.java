package Relation;

public class ForNestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, evenSum =0, oddSum=0;
		int count= 50;
		for(a=1; a<=count;a++) {
			if(a%2==0) {
				evenSum +=a;
				System.out.println("EvenSum : "+a );
			}
			else {
				oddSum +=a;
				System.out.print("OddSum : "+a );
			}
		}
		System.out.println("EvenSum : "+evenSum + " , "+ " OddSum : "+oddSum);
	}

}
