package sandeshselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisabledText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/DisabledText.html");
	    driver.manage().window().maximize();
	    
	    
	    
	    
	    
	    WebElement ele = driver.findElement(By.id("abc"));
	    WebDriverWait ww = new WebDriverWait(driver, 10);
	    ww.until(ExpectedConditions.visibilityOf(ele));
	    ele.sendKeys("sandesh");
	    
	    
	    
	    
	    
	}
}
	
	
	
	
