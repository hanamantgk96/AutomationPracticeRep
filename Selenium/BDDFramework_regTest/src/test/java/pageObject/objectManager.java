package pageObject;

import org.openqa.selenium.WebDriver;

public class objectManager {
	
	public WebDriver driver;
	
	public LoginPage loginPage;
	public LpoPage Lpopage;
	public Placeorder placeorder;
	
	public objectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage1() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	
	public LpoPage getLpopage() {
		Lpopage = new LpoPage(driver);
		return Lpopage;
	}
	
	public Placeorder getplaceorder() {
		placeorder = new Placeorder(driver);
		return placeorder;
}
}