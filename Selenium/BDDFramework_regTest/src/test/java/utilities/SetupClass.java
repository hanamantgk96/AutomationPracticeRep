package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupClass {

	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("URL");

		if (driver == null) {

			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
				options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				driver = new ChromeDriver(options);
			}
			
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.manage().window().maximize();
		}
		return driver;
	}
}
