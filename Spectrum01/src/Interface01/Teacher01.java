package Interface01;

public class Teacher01 extends Person01 implements SocialWorker {
	private String sub;
	private double sallery;
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public double getSallery() {
		return sallery;
	}
	public void setSallery(double sallery) {
		this.sallery = sallery;
	}
	@Override
	public void helpToOthers() {
		 System.out.println("He/She donates some part of their sallery in cherity!");
		
	}
}
