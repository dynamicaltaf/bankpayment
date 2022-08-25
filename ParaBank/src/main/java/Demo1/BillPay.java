package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPay {
	
	@FindBy (xpath = "\"//*[@id=\\\"leftPanel\\\"]/ul/li[4]/a\"") private WebElement bPay;
	@FindBy (xpath = "//input[@name='payee.name']") private WebElement PayeeName;
	@FindBy (xpath = "//input[@name='payee.address.street']") private WebElement Address;
	@FindBy (xpath = "//input[@name='payee.address.city']") private WebElement City;
	@FindBy (xpath = "//input[@name='payee.address.state']") private WebElement State;
	@FindBy (xpath = "//input[@name='payee.address.zipCode']") private WebElement ZipCode;
	@FindBy (xpath = "//input[@name='payee.phoneNumber']") private WebElement Phone;
	@FindBy (xpath = "//input[@name='payee.accountNumber']") private WebElement Account;
	@FindBy (xpath = "//input[@name='verifyAccount']") private WebElement VerifyAccount;
	@FindBy (xpath = "//input[@name='amount']") private WebElement Amount;
	@FindBy (xpath = "//select[@name='fromAccountId']") private WebElement FromAcount;
	@FindBy (xpath = "//input[@class='button']") private WebElement SendPayment;
	
	
	
	public BillPay(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void  BillPayment() {
		bPay.click();
		
	}
	public void Recipentdetails() {
		PayeeName.sendKeys("Eleanor Martin");
	}	
	public void address()	{
		Address.sendKeys("8806 Wycliff Ave");
	}
	public void city() {
		City.sendKeys("Billings");
	}
	
	public void states() {
		State.sendKeys("Michigan");
	}
	
	public void code() {
		ZipCode.sendKeys("63106");
	}
	
	public void phon() {
		Phone.sendKeys("(967) 577-6870");
	}	
	
	public void acountt() {
		Account.sendKeys("13677");
	}	
	
	public void verify() {
		VerifyAccount.sendKeys("13677");
	}
	
	public void amount() {
		Amount.sendKeys("20");
	}	
	
	public void fromacount() {
		FromAcount.click();
	}
	public void sendpayment() {
		SendPayment.click();
	}		
}
