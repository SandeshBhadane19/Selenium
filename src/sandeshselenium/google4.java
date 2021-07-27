package sandeshselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google4 {
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
     	Thread.sleep(2000);
     	Robot r = new Robot();
     	r.keyPress(KeyEvent.VK_CONTROL);
     	r.keyPress(KeyEvent.VK_C);
     	Thread.sleep(2000);
     	r.keyPress(KeyEvent.VK_CONTROL);
     	r.keyPress(KeyEvent.VK_T);
     	r.keyPress(KeyEvent.VK_CONTROL);
     	r.keyPress(KeyEvent.VK_V);
     	r.keyPress(KeyEvent.VK_ENTER);
     	r.keyRelease(KeyEvent.VK_CONTROL);
     	r.keyRelease(KeyEvent.VK_ENTER);
     	r.keyRelease(KeyEvent.VK_C);
     	r.keyRelease(KeyEvent.VK_T);
     	r.keyRelease(KeyEvent.VK_V);
     
	    }
}
	   
	   
	   
	   
	   
	     
	   
	 //h2/span[contains(.,'Java')]
	   // List<WebElement>  suggs = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	 //   for (WebElement sugg : suggs) {
	 //   	System.out.println(sugg.getText());//
	    //}
	    	//suggs.get(2).click();
			

