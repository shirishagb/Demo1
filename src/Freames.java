import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Freames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.findElement(By.cssSelector("div[id='draggable']")).click();
		Actions a = new Actions(driver);
		WebElement source= driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement destination= driver.findElement(By.cssSelector("div[id='droppable']"));
		a.dragAndDrop(source, destination).build().perform();

	}

}
