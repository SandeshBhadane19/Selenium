package sandeshselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHq {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
	    driver.manage().window().maximize();
	    WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	    search.sendKeys("java",Keys.ENTER);
	    navigate().
	    
	    
	    
	    
}
}