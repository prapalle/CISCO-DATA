package Basics;

public class ConditionExample {

	public static void main(String[] args) {
		int a=1231;
		int b=23434;
		if(a>b) {
			System.out.println("a is greater" +a);}
		else {
			System.out.println("b is greater" +b);
		}
		
		 int c=345345;
		 
		 if(a>b & a>c) {
		 System.out.println("a is greater"+a);
		 }
		 else if(b>c) {
		 System.out.println("b is Greater"+b);
		 }
		 else {
		 System.out.println("C is greater"+c);
		 }

}
}