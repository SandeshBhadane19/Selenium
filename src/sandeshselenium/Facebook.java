package sandeshselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	    driver.manage().window().maximize();
	   WebElement email = driver.findElement(By.id("email"));
	   WebElement password  = driver.findElement(By.id("pass"));
	   email.sendKeys("Ranbir"); 
	   password.sendKeys("Sagar");	  
	   WebElement login = driver.findElement(By.name("login"));
	   login.click();
	}
}

