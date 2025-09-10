package Exceptions;
public class Test1Exception {
	public static void main(String[] args) {
		
		
		try {
			checkEligibility(15);
		} catch (customException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void checkEligibility(int age) throws customException{
		if(age<19) {
			//System.out.println("Not Eligible for Driving");
			
			throw new customException("Person age is not eligible for driving");
			
			
		}else {
			System.out.println("Eligible for Driving");
		}
		
}
}
