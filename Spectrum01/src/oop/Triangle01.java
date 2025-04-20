package oop;

public class Triangle01 extends Shape {
	private double height, base;
	
	public void area() {
		System.out.println("triangle Area : "+ 0.5 * base * height);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
}
