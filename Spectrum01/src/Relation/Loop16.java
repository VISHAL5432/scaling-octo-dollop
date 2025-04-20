package Relation;

public class Loop16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;int fact =0;
		System.out.print("Factor of given num : "+n +" = ");
		for(int i =1; i<=n; i++) {
			if(n%i==0 ){
				fact =i;
				System.out.print(fact+" ");
			}
			 
		}
	}

}
