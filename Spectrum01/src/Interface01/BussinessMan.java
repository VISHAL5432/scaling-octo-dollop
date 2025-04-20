package Interface01;

public class BussinessMan extends Person01 implements RichMan,SocialWorker  {
	private String Business;

	public String getBusiness() {
		return Business;
	}

	public void setBusiness(String business) {
		Business = business;
	}

	@Override
	public void earnMoney() {
		 System.out.println("Earn too much money in bussiness !");
		
	}

	@Override
	public void party() {
		 System.out.println("Spent 5 cr money on a Party!");
		
	}

	@Override
	public void donation() {
		 System.out.println("Spent money to feed hungry and homeless!");
		
	}

	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
		
	}
}
