package HashSet_;

public class Mobile {
 private String company;
 private long imei;
 private String mid;
 private int price;

 public Mobile() {
	 
 }
 public Mobile(String company, long imei, String mid, int price, String model) {
	super();
	this.company = company;
	this.imei = imei;
	this.mid = mid;
	this.price = price;
	this.model = model;
}
 
 
@Override
public int hashCode() {
	 
	return mid.hashCode();
}
@Override
public boolean equals(Object obj) {
	 if (obj == null) {
		 return false;
	 }
	 if (!(obj instanceof Mobile))
	return false;
	 Mobile mm=(Mobile)obj;
	 return this.getMid().equals(mm.getMid());
}
@Override
 
public String toString() {
	return "Mobile [company=" + company + ", imei=" + imei + ", mid=" + mid + ", price=" + price + ", model=" + model
			+ "]";
}
private String model;
 
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public long getImei() {
	return imei;
}
public void setImei(long imei) {
	this.imei = imei;
}
public String getMid() {
	return mid;
}
public void setMid(String mid) {
	this.mid = mid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}

}
