package sandeshselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	   WebElement Search = driver.findElement(By.name("q"));
	   Search.sendKeys("Java");  
	   Thread.sleep(2000);
	    List<WebElement>  suggs = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	    for (WebElement sugg : suggs) {
	    	System.out.println(sugg.getText());
	    }
	    	suggs.get(2).click();
		}
	}


