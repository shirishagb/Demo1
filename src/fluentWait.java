import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWait {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		  
		/*  Wait <WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(3));*/
			 
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='start'] button")));
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
	//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Hello World!")));
		 
	
		 
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
		
	}

}
