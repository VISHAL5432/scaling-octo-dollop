package oop;

public class Circle01 extends Shape {
	private double radius;


	public void area() {
		System.out.println("Circle Area : " + Math.PI* radius*radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
