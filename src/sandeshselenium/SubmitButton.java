package sandeshselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/ButtonClick2.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   WebElement ele = driver.findElement(By.id("otherBtn"));
	   WebDriverWait ww = new WebDriverWait(driver, 10);
	   ww.until(ExpectedConditions.elementToBeClickable(ele));
	   ele.click();
	   WebElement ele2 = driver.findElement(By.id("sBtn"));
	   ww.until(ExpectedConditions.elementToBeClickable(ele2));
	   ele2.click();
	}
}