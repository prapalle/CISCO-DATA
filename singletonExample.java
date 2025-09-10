package Basics;
public class singletonExample {
	
	//private variable
	private static singletonExample instance;
	
	private singletonExample() {
		System.out.println("singletonExample Constructor");
	}
	
	public static singletonExample getInstance() {
		
		if(instance==null) {
			instance=new singletonExample();
		}
		return instance;
		
	}
	
	public void test() {
		System.out.println("Sample Test Method");
	}
	
	
	public static void main(String[] args) {
		
		
		singletonExample ston=singletonExample.getInstance();
		ston.test();
	}
	
	
	
}

