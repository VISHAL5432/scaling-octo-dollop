package Relation;

public class Loop21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n =50;int i;
			System.out.print("Prime nums between 1 and 50 : ");
			for( i=1; i<=n;i++) {
				int fact =0;
				for(int j =1;j<=i;j++) {
					if(i%j ==0) {
						fact++;
					}
				}
			
			if(fact==2) {
				System.out.print(i+",");
			}
		 
			}
	}

}
