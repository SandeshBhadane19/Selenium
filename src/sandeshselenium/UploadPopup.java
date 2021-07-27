package sandeshselenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/upload/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("file_wraper0")).click();
	    Thread.sleep(2000);
	    Runtime r = Runtime.getRuntime();
       String path = "C:\\\\Users\\\\Sandesh\\\\Desktop\\\\SELF IMP\\\\sdb.exe";
       r.exec(path);
	    
	}
}
