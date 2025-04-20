package oop;

public class Rectangle01 extends Shape {
	private double length,width;
   
	public void area(){
		System.out.println("rectangle area is:   "+length*width);
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
}