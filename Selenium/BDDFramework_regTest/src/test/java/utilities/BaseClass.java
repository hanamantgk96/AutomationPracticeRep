package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.objectManager;

public class BaseClass {
	
	public WebDriver driver;
	public SetupClass setupclass;
	public objectManager pageObjectManager;

	public BaseClass() throws IOException {
		setupclass = new SetupClass();
		pageObjectManager = new objectManager(setupclass.webDriverManager());

	}

}
