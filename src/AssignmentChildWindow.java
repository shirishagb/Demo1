import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com");
		  driver.findElement(By.cssSelector("a[href='/windows']")).click();
		  driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		  
		  Set<String> windows=driver.getWindowHandles();
		  Iterator<String> it=windows.iterator();
		  String ParentID=it.next();
		  String ChildID=it.next();
		  driver.switchTo().window(ChildID);
		 System.out.println( driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		 driver.switchTo().window(ParentID);
		 System.out.println( driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		  
		  //lets see here
		  
		  

	}

}
