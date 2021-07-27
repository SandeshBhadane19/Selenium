package sandeshselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		//driver.manage().window().maximize();
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(slider, 50, 0).perform();
		
}
}