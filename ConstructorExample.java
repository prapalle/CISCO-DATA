package OOPS;
public class ConstructorExample {
	int a;
	
	//Constructor without parameters
	public ConstructorExample() {
		a=10;
		System.out.println("Hello Constructor");
	}
	
	
	
	//main method
	public static void main(String[] args) {
		
		ConstructorExample ce1=new ConstructorExample();
		ConstructorExample ce2=new ConstructorExample();
		ConstructorExample ce3=new ConstructorExample();
		ConstructorExample ce4=new ConstructorExample();
		ConstructorExample ce5=new ConstructorExample();
		System.out.println(ce1.a);
	}
	
	
}
