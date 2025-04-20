package methodOverRiding;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		
	}
	public Circle(Double radius) {
		this.radius=radius;
	}
	public void area() {
		System.out.println("Area of Circle : "+ Math.PI *radius *radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
