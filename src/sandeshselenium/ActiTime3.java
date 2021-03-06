package sandeshselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	     String user = ReadData.readCell("./login.xlsx","login",1, 0);
	     String pass = ReadData.readCell("./login.xlsx","login",1, 1);
	     driver.findElement(By.id("username")).sendKeys(user);  
	     driver.findElement(By.name("pwd")).sendKeys(pass,Keys.ENTER);    
}
}