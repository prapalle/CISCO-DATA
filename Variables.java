package Basics;
public class Variables{
	int a=10; //global non static variable
	static int b=20; //global static variable
	
	
	public static void main(String[] args) {
		
//System.out.println(a);
System.out.println(b);
//System.out.println(i);
Variables v=new Variables();
v.test();
		
System.out.println(v.a);
		
	}
	
	
	
	public void test() {
		int i=15; //local variable
		System.out.println(a);
		System.out.println(b);
	}
	
	
}
