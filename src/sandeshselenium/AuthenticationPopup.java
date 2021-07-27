package sandeshselenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class AuthenticationPopup {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	}

