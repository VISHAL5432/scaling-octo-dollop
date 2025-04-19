package HashSet_;

import java.util.Comparator;

public class OrderBYName implements Comparator<Emp_01> {

	@Override
	public int compare(Emp_01 o1, Emp_01 o2) {
		 
		return o1.getName().compareTo(o2.getName());
	}

}
class SalaryWise implements Comparator<Emp_01>{

	@Override
	public int compare(Emp_01 o1, Emp_01 o2) {
		 
		return (int)(o1.getSalary()-o2.getSalary());
	}
	
}
