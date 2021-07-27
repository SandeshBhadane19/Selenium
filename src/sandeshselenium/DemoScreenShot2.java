package sandeshselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class DemoScreenShot2 {
public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

Thread.sleep(1000);
TakesScreenshot ts=(TakesScreenshot)driver;
File ss=ts.getScreenshotAs(OutputType.FILE);
File ssSave=new File("./Screenshot/facebook.png");
Files.copy(ss,ssSave);
}


public static void takePic(WebDriver driver,String name) throws IOException
{
TakesScreenshot ts=(TakesScreenshot)driver;
File ss=ts.getScreenshotAs(OutputType.FILE);
File ssSave=new File("./Screenshot/"+name+ ".png");
Files.copy(ss,ssSave);

}
}

