package OOPS;
public class ChildExample extends ParentExample{
	public static void main(String[] args) {
	
		ChildExample ce=new ChildExample();
		ce.child_test();
		ce.parent_test();
		ce.add();
		
		
	}
	
	
	public void child_test() {
		System.out.println("Child Function");
	}
	public void add() {
		System.out.println("Child Add Function");
	}
}
