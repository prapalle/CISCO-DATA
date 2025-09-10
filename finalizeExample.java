package OOPS;
public class finalizeExample {
	
	
	public static void main(String[] args) {
		
		
		
		finalizeExample fe1= new finalizeExample();
		fe1=null;
		
		System.gc();
		System.out.println("Main Method");
		
		
		
	}
	
	
	public void finalize() {
		System.out.println("Execute Finalize method");
	}
	
	public void Print() {
		System.out.println("Printing");
	}
}
