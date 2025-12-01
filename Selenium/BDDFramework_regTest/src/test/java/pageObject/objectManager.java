package pageObject;

import org.openqa.selenium.WebDriver;

public class objectManager {
	
	public WebDriver driver;
	
	public LoginPage loginPage;
	
	public objectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage1() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}

}
