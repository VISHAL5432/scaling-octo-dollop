package Method;
import java.time.LocalDateTime;
public class LocalDateTime01 {

	public static void main(String[] args) {
	 LocalDateTime ldt = LocalDateTime.now();
	 System.out.println(ldt);
	 System.out.println(ldt.getDayOfMonth()+"/"+ldt.getMonth()+"/"+ldt.getYear());
	 System.out.println(ldt.getDayOfYear());
	 System.out.println(ldt.getDayOfWeek());
	}

}
