package sandeshselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	   WebElement user = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	   WebElement pass = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	 driver.findElement(By.id("username")).sendKeys(user.getText());
	 driver.findElement(By.id("pwd")).sendKeys(pass.getText());
	   WebElement login = driver.findElement(By.id("loginButton"));
	   System.out.println(login.isDisplayed());   
	   login.click();
	   
	   
	   
	   //changes in github
	   //WebElement pwd  = driver.findElement(By.name("pwd"));
	   user.sendKeys("admin"); 
	   pwd.sendKeys("manager");	
	  Thread.sleep(1000);
	 
	}
}
