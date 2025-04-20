package Interface01;

public interface EInter {
	public void hi();
	public default void show() {
		System.out.println("Show at DInter Defined!");
	}
}
interface DInter{
	public void hello();
	public default void wish() {
		System.out.println("Show at EInter Defined!");
	}
}
