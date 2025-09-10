package TestNG;
import org.testng.annotations.Test;
public class TestExample {
	
	
	@Test(enabled=false)
	public void Test1() {
		System.out.println("Test1");
		
	}
	
	@Test(timeOut=1000,groups = {"Sanity"})
	public void Test2() {
		System.out.println("Test2");
		
	}
	
	@Test(timeOut=1000,groups = {"Sanity","Regression"})
	public void Test3() {
		System.out.println("Test3");
		
	}
}
