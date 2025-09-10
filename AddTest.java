package TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTest {
	
@Test
	public void testadd() {
	
	Calc sum=new Calc();
	Assert.assertEquals(50, sum.add(20,30));

	}




}

