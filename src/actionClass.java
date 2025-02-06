import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class actionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=728858856234&hvpos=&hvnetw=g&hvrand=3426411408519824294&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007790&hvtargid=kwd-64107830&hydadcr=14452_2409549&gad_source=1");
		  
		  WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		 
		  
		  Actions a=new Actions(driver);
		  a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick() .build().perform();
		//  a.doubleClick(driver.findElement(By.cssSelector("input[type='text']"))).build().perform();
		  a.moveToElement(move).contextClick().build().perform();
		  
		  System.out.println("Hello new code");

	}

}
