package sandeshselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	   WebElement Search = driver.findElement(By.name("q"));
       System.out.println("is Enable :" + Search.isEnabled());
	   Search.sendKeys("Java",Keys.ENTER);  
	   Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   /*js.executeScript("window.scrollBy(0,1000)");
	   Thread.sleep(2000);
	   js.executeScript("window.scrollBy(0,-500)");*/
	   
	   
	   /*js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	   Thread.sleep(2000);
	   js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");*/
	   
	   WebElement ele = driver.findElement(By.xpath("//span[text()='View all']"));
		  
	   
}
}
