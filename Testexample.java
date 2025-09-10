package TestNG2;
import org.testng.annotations.Test;
public class Testexample {
	
	
	@Test(enabled=false)
	public void Test1() {
		System.out.println("Test1");
		
	}
	
	@Test(timeOut=1000,groups= {"Sanity"})
	public void Sanity1() {
		System.out.println("Sanity");
		
	}
	
	@Test(groups= {"Regression"})
	public void Regression1() {
		System.out.println("Regression");
		
	}
	@Test(timeOut=1000,groups= {"Sanity","Regression"})
	public void SanityRegression() {
		System.out.println("Sanity and Regression");
		
	}
}
