package HashSet_;

public class Array_01 {

	public static void main(String[] args) {
		 int ar []= {2,3,4,5,6,74,4,2};
		 int dupcount = 0;
		 int count=0;
		 for(int i =0 ;i<ar.length;i++) {
			 for( int j =i+1; j<ar.length;j++) {
				 if(ar[i]==ar[j]) {
					 dupcount++;
					 count++;
				 }
			 }
			 System.out.print(ar[i]+",");
		 }
		 System.out.println();
		 System.out.println("Duplicate count : "+dupcount);
	}

}
