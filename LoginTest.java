package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{

	@Test
	public void LogiFailureTest(){

		LoginPage login=new LoginPage();
		login.LoginFunction("test@gmail.com", "Raghu!299");
		WebElement ErrorMsg=driver.findElement(By.id("msg_box"));

		String ActualMsg=ErrorMsg.getText();
		
		System.out.println(ActualMsg);
		
		String ExpMsg = "The email or password you have entered is invalid.";

		Assert.assertEquals(ActualMsg, ExpMsg);
		}

	
	

		@Test
		public void LoginSuccessTest(){
			LoginPage login1=new LoginPage();
			login1.LoginFunction("test@gmail.com", "Raghu1234");
		}
	
		
		@Test
		public void LoginSuccessTest1(){
			LoginPage login1=new LoginPage();
			login1.LoginFunction("test@gmail.com", "Raghu1234");
		}
	
}
