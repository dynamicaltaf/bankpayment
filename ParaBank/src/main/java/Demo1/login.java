package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class login {
	
	
	@FindBy (xpath = "//input[@name='username']") private WebElement UserName;
	@FindBy (xpath = "//input[@name='password']") private WebElement Password;
	@FindBy (xpath = "//input[@type='submit']") private WebElement LoginButton;

	
	
	public login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void un() {
		UserName.sendKeys("I3gczy@cooooooo.com"); 
		
	}
	public void pwd() {
		Password.sendKeys("monalisa");
	}
	public void submit() {
		LoginButton.click();
	}
	
}
