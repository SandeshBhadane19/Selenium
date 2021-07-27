package sandeshselenium;



import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder4 {
public static void main(String[] args) throws InterruptedException, IOException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.urbanladder.com/");
driver.manage().window().maximize();
//Thread.sleep(10000);
//String title=driver.getTitle();
//System.out.println(title);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement close=driver.findElement(By.xpath("//a[@ class= 'close-reveal-modal hide-mobile']"));
close.click();
Actions a=new Actions(driver);
List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
for(WebElement menuName : menu)
{
String name=menuName.getText();
System.err.println(name);
Thread.sleep(1000);
a.moveToElement(menuName).perform();
Thread.sleep(2000);
DemoScreenShot.takePic(driver,name);
List<WebElement> subMenu=driver.findElements(By.xpath("//span[contains(., ' " + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
for(WebElement subname : subMenu)
{
a.moveToElement(subname).perform();
System.out.println(subname.getText());
}
//Thread.sleep(1000);
}
}
}
