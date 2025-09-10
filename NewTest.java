package TestNG;
import org.testng.annotations.*;
public class NewTest {
	
	
	@Test(dependsOnMethods= {"Login"})
	public void sendEmail() {
		System.out.println("Send Email");
		
	}
	
	@Test(dependsOnMethods= {"Login","sendEmail"})
	public void Logout() {
		System.out.println("Logout");
		
	}
	@Test
	public void Login() {
		System.out.println("Login");
		
	}
	@BeforeSuite
		public void BeforeSuite() {
		System.out.println("Launch Browser");
		}
		
	
		
		
		@AfterSuite
		public void AfterSuite() {
			System.out.println("Close Browser");
		}
	
}
