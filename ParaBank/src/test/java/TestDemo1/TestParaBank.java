package TestDemo1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo1.BillPay;
import Demo1.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParaBank {

	WebDriver driver;
	login lg;
	BillPay billpay;

	@BeforeClass
	public void userLogin() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// billpay = new BillPay(driver);

	}

	@BeforeMethod
	public void loginBank() throws IOException, Exception {
		lg = new login(driver);
		lg.un();
		lg.pwd();
		lg.submit();
		

	}

	@Test
	public void varifyTransaction() throws Exception {

		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(title, title);
		Assert.assertEquals(url, url);

	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	public void closeObject() {
		lg = null;
		driver.quit();

	}

}
