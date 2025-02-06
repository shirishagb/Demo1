import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class childWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to')]")).click();
		Set<String> windows= driver.getWindowHandles();  //[ParentID,ChildID]
		Iterator<String> it= windows.iterator();
		String ParentID=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
		//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String mail= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(mail);
		driver.switchTo().window(ParentID);
		driver.findElement(By.id("username")).sendKeys(mail);

	}

}
