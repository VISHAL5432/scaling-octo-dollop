package methodOverRiding;

public class TestBank {

	public static void main(String[] args) {
		 RBIBank rb = new AxisBank() ;
		 System.out.println("Axis Bank Interest Rate : "+rb.intrestRate());
		 RBIBank hb = new ICICIBank();
		 System.out.println("ICICI Bank Intrest Rate : "+hb.intrestRate());
		 RBIBank sb = new SBIBank();
		 System.out.println("SBI Bank Interest Rate : "+sb.intrestRate());
			 
	}

}
