package Interface01;

public class Circle implements Shape {

	@Override
	public void getArea() {
		double radius = 2.5;
		System.out.println("Area of Circle : "+(Math.PI* radius*radius));
		
	}

}
