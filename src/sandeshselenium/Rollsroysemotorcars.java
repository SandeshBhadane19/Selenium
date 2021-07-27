package sandeshselenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rollsroysemotorcars {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.rolls-roycemotorcars.com/en_GB/home.html");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.manage().getCookies();
}
}