import java.util.Arrays;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
@SuppressWarnings("deprecation")
public class SeleniumProgramm {
	
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait d= new WebDriverWait(driver, 5); 
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String iteamsNeeded[]= {"Brocolli","Cucumber","Beetroot"};
		addIteams(driver, iteamsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(.,'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.print(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

public static void addIteams(WebDriver driver, String[] iteamsNeeded) {

	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0;i<products.size();i++)
	{
		String[] str= products.get(i).getText().split("-");
		String formattedName=str[0].trim();
		List iteamNeededList=Arrays.asList(iteamsNeeded);
		
		int j=0;
		if(iteamNeededList.contains(formattedName))
		{
			j++;
			(driver.findElements(By.xpath("//div[@class='product-action']/button"))).get(i).click();
			
			if(j==iteamsNeeded.length)
				break;
		}
		
	}
	
}
}