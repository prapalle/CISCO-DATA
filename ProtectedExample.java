package AccessModifiers;
public class ProtectedExample {
	public static void main(String[] args) {
		
		ProtectedExample pe=new ProtectedExample();
		pe.protectedTest();
		
	}
	
	
	protected void protectedTest() {
		System.out.println("Protected Example");
	}
}
