package Interface01;

public class TsstAcc {

	public static void main(String[] args) {
		 Account as = new SavingAccount();
		 SavingAccount sa = new SavingAccount();
		 System.out.println(as.getAmount());
		 
		 System.out.println(sa.getAmount());
	}

}
