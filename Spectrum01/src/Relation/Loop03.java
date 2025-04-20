package Relation;

public final class Loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum = 0;
	int n =10;
	for(int i=1;i<=n; i++) {
		sum +=i;
		
	}
	int aver = sum/n;
	System.out.println( "Sum = "+sum);
	System.out.println("Average = "+aver);
	}

}
