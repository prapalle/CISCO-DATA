package TestNG2;
import org.testng.annotations.Parameters;

public class testDatafromXML {
	
@Parameters({"browser"})	
@Test	
public void printData(String browser) {
	System.out.println(browser);
}
}
