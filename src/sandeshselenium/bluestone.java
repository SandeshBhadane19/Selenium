package sandeshselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement rings = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']"));
		Actions a = new Actions(driver);
		a.moveToElement(rings).perform();
	     driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']"));
		WebElement defaultprice = driver.findElement(By.xpath("//span/span[contains(.,'Price')]"));
		a.moveToElement(defaultprice).perform();
		List<WebElement> dPrice = driver.findElements(By.xpath("//form[@id='price']/div[@class = 'form-items']"));
		for (WebElement price : dPrice) {
			System.out.println(price.getText());
		}
		WebElement popular = driver.findElement(By.xpath("//span/span[contains(.,'Popular')]"));
		a.moveToElement(popular).perform();
		driver.findElement(By.xpath("//a[contains(.,'Price Low to High ')]"));
		//a[contains(.,'Price Low to High ')]
	}		
}
 