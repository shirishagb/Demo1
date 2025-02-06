import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForAllSections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wbdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Selecting Radio Button
			driver.findElement(By.xpath("//input[@value='radio1']")).click();
			
		//Selecting country from dynamic list
			List <WebElement> options=driver.findElements(By.cssSelector("input[class='inputs ui-autocomplete-input']"));
			for(WebElement option:options)
			{
				if(option.getText().equals("India"))
				{
					option.click();
					break;
				}
			}
			
		//DropDown List selection
			WebElement staticdown= driver.findElement(By.id("dropdown-class-example"));
			Select dropdown= new Select(staticdown);
			dropdown.selectByValue("option1");
			
		//selecting checkbox
			
			driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
			
		//SwitTo to the child window 
			
			driver.findElement(By.id("openwindow")).click();
			Actions a= new Actions(driver);
			Set<String> window=driver.getWindowHandles();//[Parent [0],Child[1])
			Iterator<String> it=window.iterator();
			String ParentID=it.next();
			String ChildID=it.next();
			driver.switchTo().window(ChildID);
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//body"))));
			driver.close();
			
		//Open tab
			
			driver.findElement(By.id("opentab")).click();
			
			
			
			
			
	}

}
