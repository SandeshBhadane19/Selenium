package sandeshselenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*js.executeScript("window.scrollBy(200,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200,0)");*/
		//js.executeScript("g");
		//Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");	
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
}
}