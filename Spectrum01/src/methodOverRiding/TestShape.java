package methodOverRiding;

public class TestShape {

	public static void main(String[] args) {
		 Circle c = new Circle();
		 c.setBorderWidth(2);
		 c.setColor("Red");
		 c.setRadius(2.5);
		 System.out.print("Circle Details : ");
		 System.out.println(c.getBorderWidth()+" "+c.getColor());
		 c.area();
		
		 Rectangle r = new Rectangle();
		 r.setBorderWidth(4);
		 r.setColor("Orange");
		 r.setWidth(20);
		 r.setLength(25);
		 System.out.print("Rectangle Details : ");
		 System.out.print(r.getBorderWidth()+" "+ r.getColor()+" "+r.getLength());
		 System.out.println(r.getWidth());
		 r.area();
		 
		 Trangle t= new Trangle();
		 t.setBorderWidth(6);
		 t.setColor("Blue");
		 t.setHeight(11);
		 t.setBase(22);
		 System.out.print("Trangle Detail : ");
		 System.out.println(t.getBorderWidth()+" "+t.getColor()+" "+ t.getHeight()+" "+t.getBase());
		t.area();
		System.out.println("-------------------");
		 // Parents can keep child's Reference
		Shape sc=new Circle();     			// Up Casting
		sc.setBorderWidth(2);
		sc.setColor("Black");
		//sc.area();	
		Circle cc = (Circle)sc;			// Down Casting
		cc.area();
		System.out.println("--------------------");
		
		Shape ssc = new Circle(2.4);
		Shape sr = new Rectangle(12,11);
		Shape st = new Trangle(30, 20);
		ssc.area();
		sr.area();
		st.area();
	}	

}
