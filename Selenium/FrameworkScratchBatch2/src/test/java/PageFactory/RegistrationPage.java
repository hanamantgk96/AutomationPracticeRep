package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class RegistrationPage  {
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	WebElement street;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	WebElement state;
	
	public void enterFirstName(String Fname)
	{
		fname.sendKeys(Fname);
	}
	
	public void enterLastName(String Lname)
	{
		lname.sendKeys(Lname);
	}
	
	public void enterStreet(String Street)
	{
		street.sendKeys(Street);
	}
	
	public void enterCity(String City)
	{
		city.sendKeys(City);
	}
	
	public void enterState(String State)
	{
		state.sendKeys(State);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
