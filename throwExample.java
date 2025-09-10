package Exceptions;
public class throwExample {
	
	
	
	public static void main(String[] args) {
		
		checkEligibility(15);
		
	}
	
	
	
	public static void checkEligibility(int age) {
		if(age<19) {
			//System.out.println("Not Eligible for Driving");
			
			throw new ArithmeticException("Not eligible for Driving");
			
			
		}else {
			System.out.println("Eligible for Driving");
		}
		
		
		
	}
}
