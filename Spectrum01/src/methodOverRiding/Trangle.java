package methodOverRiding;

public class Trangle extends Shape {
	private double base ;
	private double height;
	public Trangle() {
		
	}
	public Trangle (double base,double height ) {
	 this.base=base;
	 this.height=height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void area() {
		System.out.println("Area of Trangle : "+ 0.5 *base * height );
	}
}
