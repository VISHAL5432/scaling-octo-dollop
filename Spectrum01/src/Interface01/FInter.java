package Interface01;

public interface FInter {
	public void hi();
	public default void show() {
		System.out.println("Show at FInter - Defined !");
	}
	
}
interface GInter{
	public void hi();
	public default void show() {
		System.out.println("Show at GInter - Defined !");
	}
}
class FGClass implements FInter, GInter{

	@Override
	public void hi() {
		 System.out.println("HI at GFClass ");
	}
	public void show() {
		FInter.super.show();
		GInter.super.show();
		
		System.out.println("show at FGClass");
	}
}
