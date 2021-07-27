package sandeshselenium;



import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class google5 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	   driver.manage().window().maximize();
	   WebElement Search = driver.findElement(By.name("q"));
	   Search.sendKeys("Java",Keys.ENTER); 
	  Thread.sleep(2000);
	   Actions a = new Actions(driver);
	   WebElement java = driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
     	a.doubleClick(java).perform();
		}
}