package PageObject;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserCreation {
	
	WebDriver driver;
	WebDriverWait wait;
	Random random = new Random();
	
	public UserCreation(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}
	
	By Clickgrid = By.xpath("//div[@class='menu-cont' ] //img[@alt='img']");
	By ClickAdministrator = By.xpath("//ul//li//span[text()='Administrator']");
	By Click_createorganisation = By.xpath("//ul//li//span[text()='Create Organization']");
	
	public void clickgrid() {
		driver.findElement(Clickgrid).click();
	}

	public void clickAdministrationoption() {
		driver.findElement(ClickAdministrator).click();
	}

	public void clickCreateOrganisation() {
		driver.findElement(Click_createorganisation).click();
	}
	
	public void orgName() throws InterruptedException {
		
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		driver.findElement(clicksubmit).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Org Name(mandatory)");

		String timestamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String Orgdesc = "FOT " + timestamp;

		WebElement Orgname = driver.findElement(By.name("desc"));

		Orgname.sendKeys(Orgdesc);

		System.out.println("Status : Passed");

		Thread.sleep(2000);
	}	
	
	public void orgTypebusiness() throws InterruptedException {
		
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		driver.findElement(clicksubmit).click();	

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Org Type(mandatory)");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement orgType = wait.until(ExpectedConditions.elementToBeClickable(By.name("orgType")));
		Select orgTypeDrop = new Select(orgType);

		orgTypeDrop.selectByIndex(2);

		System.out.println("Status : Passed");

		Thread.sleep(1000);
}
	
	public void firstName() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		driver.findElement(clicksubmit).click();

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Firstname(mandatory)");

		WebElement fname = driver.findElement(By.name("first_name"));

		fname.sendKeys("FreshonTable");

		System.out.println("Status : Passed");

		Thread.sleep(1000);

	}
	
	public void mobileNo() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		
		driver.findElement(clicksubmit).click();

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without mobile No(mandatory)");

		Thread.sleep(2000);

		StringBuilder mobileNumber = new StringBuilder();
		Random rand = new Random();

		mobileNumber.append(rand.nextInt(9) + 1);

		for (int i = 0; i < 8; i++) {
			mobileNumber.append(rand.nextInt(10));
		}

		WebElement mobileInput = driver.findElement(By.name("mobile_no"));
		mobileInput.sendKeys(mobileNumber.toString());

		System.out.println("Status : Passed");

		Thread.sleep(1000);

	}
	
	public void Email() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		
		driver.findElement(clicksubmit).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Email(mandatory)");

		driver.findElement(By.name("email_id")).sendKeys("Fot123" + "@gmail.com");

		System.out.println("Status : Passed");

		Thread.sleep(2000);

	}
	
	public void UserNametype() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		
		driver.findElement(clicksubmit).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out
				.println("Status Failed: " + "Check if the Organization can be created without uname type(mandatory)");

		driver.findElement(By.name("uname_type"));

		WebElement unameTypeDropdown = driver.findElement(By.name("uname_type"));

		Select unameSelect = new Select(unameTypeDropdown);

		List<WebElement> options = unameSelect.getOptions();

		Random rand1 = new Random();
		int randomIndex = rand1.nextInt(options.size() - 1) + 1;

		unameSelect.selectByIndex(randomIndex);

		System.out.println("Status : Passed");

	}
	
	public void Password() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		
		driver.findElement(clicksubmit).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Password(mandatory)");

		driver.findElement(By.name("password")).sendKeys("Admin@1234");

		System.out.println("Status : Passed");

		Thread.sleep(1000);

	}
	
	public void confirmPassword() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		
		driver.findElement(clicksubmit).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		System.out.println("Status Failed: " + "Check if the Organization can be created without Confirm Password(mandatory)");
		 
		 driver.findElement(By.name("confirmPassword")).sendKeys("Admin@1234");
		 
		 System.out.println("Status : Passed");
     
     Thread.sleep(1000);
     
	}
	
	public void Address() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		
		driver.findElement(clicksubmit).click();

		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

	System.out.println("Status Failed: " + "Check if the Organization can be created without Address(mandatory)");
 
 driver.findElement(By.name("addr_1")).sendKeys("FreshonTableDubai");
 
 
 System.out.println("Status : Passed");
 
	}
	public void Location() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		WebElement contentContainer = driver.findElement(By.cssSelector("div.content-cont.toggle"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", contentContainer);
		
		driver.findElement(clicksubmit).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without location(mandatory)");
	 
	 driver.findElement(By.xpath("//input[@class='fot-formControl empty empty']")).click();

		driver.findElement(By.xpath("//button[text()[contains(., 'Confirm')]]")).click();
		
		
		System.out.println("Status : Passed");
		
	}
	
	public void Country() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		WebElement contentContainer = driver.findElement(By.cssSelector("div.content-cont.toggle"));
		Thread.sleep(1000);
				
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", contentContainer);
				driver.findElement(clicksubmit).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

				System.out.println("Status Failed: " + "Check if the Organization can be created without country(mandatory)");
				
				WebElement countrySelection = wait.until(ExpectedConditions.elementToBeClickable(By.name("country")));
				Select countryDrop = new Select(countrySelection);

				countryDrop.selectByIndex(2);
				
				
				System.out.println("Status : Passed");

				
			}
	
	public void State() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		WebElement contentContainer = driver.findElement(By.cssSelector("div.content-cont.toggle"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", contentContainer);
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without State(mandatory)");
		
		WebElement stateSelection = wait.until(ExpectedConditions.elementToBeClickable(By.name("state")));
		Select stateDrop = new Select(stateSelection);

		stateDrop.selectByIndex(2);
		
		System.out.println("Status : Passed");
		
	}
	
	public void Zone() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		WebElement contentContainer = driver.findElement(By.cssSelector("div.content-cont.toggle"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", contentContainer);
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Zone(mandatory)");
		
		WebElement zoneSelection = wait.until(ExpectedConditions.elementToBeClickable(By.name("zone")));
		Select zoneDrop = new Select(zoneSelection);

		zoneDrop.selectByIndex(2);
		
		System.out.println("Status : Passed");
		
	}
	
	public void City() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		WebElement contentContainer = driver.findElement(By.cssSelector("div.content-cont.toggle"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", contentContainer);
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without City(mandatory)");

		WebElement citySelection = wait.until(ExpectedConditions.elementToBeClickable(By.name("city")));
		Select cityDrop = new Select(citySelection);

	    cityDrop.selectByIndex(2);
	    
	    System.out.println("Status : Passed");

		Thread.sleep(1000);
		
	}
	
	public void paymentTerms() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		WebElement contentContainer = driver.findElement(By.cssSelector("div.content-cont.toggle"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", contentContainer);
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Payment Terms(mandatory)");
		
	    driver.findElement(By.xpath("(//div[@class='dropdown-heading'])[2]")).click();
	    
	    Thread.sleep(2000);

	    String termToSelect = "15 Days Credit";

	    WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//*[contains(text(),'" + termToSelect + "')]")));

	    option.click();

	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("(//div[@class='dropdown-heading'])[2]")).click();	  
	   
	   System.out.println("Status : Passed");
		
	}

}

