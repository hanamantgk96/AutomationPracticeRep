package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AccountCreationPage {
	
	WebDriver driver;
	public AccountCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//*[text()='Open New Account']")
	WebElement newAccountlink;
	
	@FindBy(xpath="//select[@id='type']")
	WebElement accountType;
	
	@FindBy(xpath="//input[@value='Open New Account']")
	WebElement accountTypeSubmit;
	
	@FindBy(xpath="//a[@id='newAccountId']")
	WebElement accountNumber;
	
	@FindBy(xpath="//div[@id='openAccountResult']/p[1]")
	WebElement message;
	
	public void enterUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	
	
	
	
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		submitBtn.click();
	}
	
	public void clickNewAccount()
	{
		newAccountlink.click();
	}
	
	public void selectAccountType()
	{
		
		Select oselect =new Select(accountType);
		oselect.selectByIndex(1);
		
	}
	public void accountTypeSubmit()
	{
		accountTypeSubmit.click();
	}
	
	public void captureAccountNumber()
	{
		String AccountNumber=accountNumber.getText();
		System.out.println(AccountNumber);
		
	}
	
	
	public void getMessage()
	{
		String msg=message.getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "Congratulations, your account is now open.");
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
