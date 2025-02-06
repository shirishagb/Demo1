

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
 



public class TestngDemoProgram {
	
	//public String baseUrl = "https://www.browserstack.com/";
	
	WebDriver driver= new ChromeDriver();
	
	
	@BeforeTest
	@Parameters ({"URL"})
	public void launchBrowser(String baseUrl) {
	System.out.println("launching Chrome browser");
	System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");

	driver.get(baseUrl);
	}
	
	@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void terminateBrowser(){
	driver.close();
	}
}
