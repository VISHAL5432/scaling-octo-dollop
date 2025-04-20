 package Relation;

public class Loop18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, temp , temp1,temp2, hcf, lcm;
		num1 = 24;
		num2 = 36;
		temp1 = num1;
		temp2 = num2;
		while (temp2 != 0){
			temp = temp2;
			temp2 = temp1%temp2;
			temp1 = temp;
		}
		hcf =temp1;
		lcm = (num1 *num2)/hcf;
		System.out.println("HCF of given num : " +hcf);
		System.out.println("LCM of given num : " +lcm);
	}

}
