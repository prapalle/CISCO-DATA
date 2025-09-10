package Exceptions;
public class tryCatchExample {
	public static void main(String[] args) {
		
	
	
	
	//try catch finally
	
		
	try {
		System.out.println("Start of Try Block");
		int a=10;
		int b=a/0;
		System.out.println(b);
		System.out.println("End of Try Block");
		
	}catch(Exception e) {
		System.out.println("Start of Catch Block");
		e.printStackTrace();
		System.out.println(e.getStackTrace());
		System.out.println("End of Catch Block");
	}
	
	finally {
		System.out.println("Start of Finally Block");
		System.out.println("End of Finally Block");
	}
	
	
	
	try {
	int i[]=new int[2];
	i[0]=10;
	i[1]=11;
	i[2]=12;
	i[3]=13;
	
	System.out.println(i[3]);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Finnaly in Array");
	}
	
	}
}
