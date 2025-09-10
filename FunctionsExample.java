package Basics;
public class FunctionsExample {
	public static void main(String[] args) {
		
		
		 FunctionsExample  t=new  FunctionsExample ();
		t.add();
		t.add();
		t.add(1,2);
		t.add(123, 234);
		t.add(12, 23, 34);
		
		int sum=t.sum(1,2);
		
		if(sum>5) {
			System.out.println("Sum is greater than five "+sum);
		}else {
			System.out.println("Sum is not greater than five "+sum);
		}
		
		
	}
	
	
	//Function without parameter
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	
	//Function with parameter
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	//Function with return type
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
}
