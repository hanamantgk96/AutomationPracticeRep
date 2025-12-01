package PageObject;

import org.openqa.selenium.WebDriver;

import PageObject.LoginSnoc;

public class Objectmanager {

	
public WebDriver driver;
	
	public LoginSnoc loginPage;
	
	public CreateOrder createorder;
	
	
	public Objectmanager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginSnoc getLoginPage() {
		loginPage = new LoginSnoc(driver);
		return loginPage;
	}
	public CreateOrder getCreateOrder() {
		createorder = new CreateOrder(driver);
		return createorder;
		
	}
}
