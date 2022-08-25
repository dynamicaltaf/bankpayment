package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver openChromeBrowser() {
     	WebDriverManager.chromedriver().setup();
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
   }
}
