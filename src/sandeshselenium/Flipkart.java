package sandeshselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement create = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	     create.click();
	     Actions a= new Actions(driver);
	   List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	    for(WebElement menuName : menues) {
	    	System.out.println(menuName.getText());
	    	Thread.sleep(3000);
	    	a.moveToElement(menuName).perform();//calling non static method
	    	Thread.sleep(3000);
	    }
	}
	}
