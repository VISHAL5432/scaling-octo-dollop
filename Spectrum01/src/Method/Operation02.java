package Method;
// call by value
 public class Operation02 {
//	int data = 540;
//	void change(Operation02 op) {
//		op.data = op.data + 100;
//		
//	}
//	public static void main(String[] args) {
//		  Operation02 op=new Operation02();  
//		  
//		   System.out.println("before change "+op.data);  
//		   op.change(op);   
//		   System.out.println("after change "+op.data );
//	}
//
//}
	 
		 int data=50;  
		  
		 void change(int data){  
		 data=data+100;//changes will be in the local variable only  
		 }  
		     
		 public static void main(String args[]){  
		   Operation02 op=new Operation02();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(500);  
		   System.out.println("after change "+op.data);  
		  
		 }  
		}  