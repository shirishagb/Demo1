import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.deriver","E:\\Selenium\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top'][1]")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle'][1]")));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		

	}

}
