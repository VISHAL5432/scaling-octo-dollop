package Arrays;

public class Array04 {
	public static void main(String agr[]) {
		int rup [] = {7,4,6,8,7,6,1,66,12,9,7,9};
		int count = 0;
		int duplicate=0;
		int dup =rup.length;
		for(int i =0; i<dup; i++) {
			count ++;
			
		}
		System.out.println("Count : " + count);
		int count1=0;
		for (int i = 0;i<dup;i++) {
			for(int j = i+1;j<dup;j++) {
				if(rup[i]==rup[j]) {
				duplicate ++;
				count1++;
				
				break;
				 
				} 	
			}
		
			System.out.print(" Duplicate value :"+rup[i]);
			
		}
		System.out.println();
		
		System.out.println("duplicate count :"+ duplicate);
	}
}
