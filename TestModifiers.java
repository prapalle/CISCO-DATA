package AccessModifiers;


import AccessModifiers.defaultExample;
import AccessModifiers.PrivateExample;

public class TestModifiers {

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
		
		pe.privateTest();
		
		defaultExample de=new defaultExample();
		
		de.defaultTest();
	}

}
