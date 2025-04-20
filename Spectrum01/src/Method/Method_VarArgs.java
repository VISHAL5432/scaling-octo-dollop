package Method;

public class Method_VarArgs {
	//Parsing Array in method
	public int sumAll(int x[]) {
		int sum = 0;
		for(int i :x) {
			sum =sum+i;
		}
		return sum;
	}
	// using var_args 
	void add(int... z) {
		int sum = 0;
		for(int a:z) {
			sum +=a;
		}
		System.out.println("Total Sum = " +sum);
	}
	void wish(String... n) {
		System.out.println("Welcome");
		for(String s:n) {
			System.out.println("Hello"+s);
		}
	}
	public static void main(String[] args) {
		 
	Method_VarArgs obj = new Method_VarArgs();
	// putting values in array before call
	int y[]= {12,33,44,22,121};
	System.out.println("Sum of all values : "+obj.sumAll(y));
	// putting values in array along with sout operation
	int s = obj.sumAll(new int [] {12,23,123,44,11});
	System.out.println(s);
	obj.add(y);
	obj.wish("Ramu", "Shayamu","Monu","Sonu");
	obj.wish("Teena","Meena","Deena");
	int z []= {2,12,33,44,55,667,9};
	obj.add(z);
	
	}
	
	
	
	
	

}
