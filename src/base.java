
import java.time.Duration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class base {


public static void main(String[] args) throws InterruptedException {

	
	    System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();



		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		//Waiting for OKay button click 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement staticDropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown= new Select(staticDropdown);
		dropdown.selectByVisibleText("Consultant");
	
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		for (int i=0;i<products.size();i++) {
			products.get(i).click();
			System.out.println(products);
		}
		driver.findElement(By.partialLinkText("Checkout")).click();


}
}



