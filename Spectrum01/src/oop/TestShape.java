package oop;

public class TestShape {
public static void main(String[] args) {
	
	Circle01 c = new Circle01();
	c.setColor("blue");
	c.setBorderWidth(5);
	c.setRadius(5);
	
	System.out.println("circle details :  ");
	System.out.println(c.getColor()+"   "+c.getBorderWidth());
	c.area();
	
	Rectangle01 r = new Rectangle01();
	r.setColor("Black");
	r.setBorderWidth(4);
	r.setLength(12);
	r.setWidth(10);
	System.out.println();
	System.out.println("Rectangle details :  ");
	System.out.println(r.getColor() + "   " + r.getBorderWidth() );
	r.area();
	Triangle01 t = new Triangle01();
	t.setColor( " Red ");
	t.setBorderWidth( 23 );
	t.setBase(23);
	t.setHeight(12);
	System.out.println("Trangle details :  ");
	System.out.println(t.getColor()+"   "+t.getBorderWidth());
	t.area();
}
}
