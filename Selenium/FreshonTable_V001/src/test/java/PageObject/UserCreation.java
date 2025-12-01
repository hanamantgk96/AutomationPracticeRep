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
	By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
	
	public WebElement getContentContainer() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content-cont.toggle")));
    }
	
	public void clickgrid() {
		driver.findElement(Clickgrid).click();
	}

	public void clickAdministrationoption() {
		driver.findElement(ClickAdministrator).click();
	}

	public void clickCreateOrganisation() {
		driver.findElement(Click_createorganisation).click();
	}
	
//-----------------------------------Organization Profile-----------------------------------------------
	
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

		
		
		WebElement firstNameField  = driver.findElement(By.name("first_name"));
		firstNameField .click();
		
		Thread.sleep(5000);
		
		WebElement firstNameError = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/label"))
            );
            System.out.println("Error message for firstName: " + firstNameError.getText());

            String firstName = "John";
            firstNameField.sendKeys(firstName);
            System.out.println("First Name Entered: " + firstName);


	}
	
	public void mobileNo() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");		
		driver.findElement(clicksubmit).click();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		

//		System.out.println("Status Failed: " + "Check if the Organization can be created without mobile No(mandatory)");

		Thread.sleep(2000);

		StringBuilder mobileNumber = new StringBuilder();
		Random rand = new Random();

		mobileNumber.append(rand.nextInt(9) + 1);

		for (int i = 0; i < 8; i++) {
			mobileNumber.append(rand.nextInt(10));
		}
		
		 WebElement mobileInput1 = driver.findElement(By.name("mobile_no"));
		 mobileInput1.click();
		Thread.sleep(5000);
		WebElement mobileNumberError = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/label"))
            );
            System.out.println("Error message for mobile number : " + mobileNumberError.getText());
		
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

//	    System.out.println("Status Failed: Check if the Organization can be created without Email(mandatory)");

	    
	    WebElement EmailInput = driver.findElement(By.name("email_id"));
	    EmailInput.click();
		Thread.sleep(5000);
		WebElement EmailError = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div/label"))
           );
           System.out.println("Error message for Email id : " + EmailError.getText());
           
           
	    // Generate random email
	    String randomEmail = generateRandomEmail();
	    driver.findElement(By.name("email_id")).sendKeys(randomEmail);

	    System.out.println("Status : Passed - Email used: " + randomEmail);

	    Thread.sleep(2000);
	}

	// Helper method to generate random email
	private String generateRandomEmail() {
	    String characters = "abcdefghijklmnopqrstuvwxyz1234567890";
	    StringBuilder emailPrefix = new StringBuilder();
	    Random random = new Random();

	    for (int i = 0; i < 8; i++) {
	        emailPrefix.append(characters.charAt(random.nextInt(characters.length())));
	    }

	    return emailPrefix.toString() + "@gmail.com";
	}
	
/*	public void Email() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		
		driver.findElement(clicksubmit).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Email(mandatory)");

		driver.findElement(By.name("email_id")).sendKeys("Fot123" + "@gmail.com");

		System.out.println("Status : Passed");

		Thread.sleep(2000);

	}*/
	
public void trnNo() throws InterruptedException {
		
		Random rand = new Random();
		int random5DigitNumber = 10000 + rand.nextInt(90000);
		String mobileNumber = String.valueOf(random5DigitNumber);
		WebElement mobileInput = driver.findElement(By.name("tinNumber"));
		mobileInput.sendKeys(mobileNumber);
		System.out.println("Status : Passed");
		
	}

public void grading() throws InterruptedException {
	
	WebElement grading = wait.until(ExpectedConditions.elementToBeClickable(By.name("grading")));
	Select gradingDropdown = new Select(grading);
	List<WebElement> options = gradingDropdown.getOptions();
	
	Random rand = new Random();
	int randomIndex = rand.nextInt(options.size() - 1) + 1;
	gradingDropdown.selectByIndex(randomIndex);	
	
	System.out.println("Status : Passed");
	
}

public void category() throws InterruptedException {
	Thread.sleep(2000);
	
	WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.name("category")));
	Select categoryDropdown = new Select(category);
	List<WebElement> options = categoryDropdown.getOptions();
	Random rand = new Random();
	int randomIndex = rand.nextInt(options.size() - 1) + 1;
	categoryDropdown.selectByIndex(randomIndex);
	
	System.out.println("Status : Passed");
}

//----------------------Organization Admin Details--------------------------------------------------
	
	public void UserNametype() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");		
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

//		System.out.println("Status Failed: " + "Check if the Organization can be created without uname type(mandatory)");

		driver.findElement(By.name("uname_type"));
		
		
		WebElement UserName_Type = driver.findElement(By.name("uname_type"));
		UserName_Type.click();
		Thread.sleep(5000);
		WebElement usertype = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div/label"))
           );
           System.out.println("Error message for usertype: " + usertype.getText());
           
Thread.sleep(2000);
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

//		System.out.println("Status Failed: " + "Check if the Organization can be created without Password(mandatory)");

		WebElement Password = driver.findElement(By.name("password"));
	    Password.click();
		Thread.sleep(5000);
		
		WebElement Password1 = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[3]/div/label"))
           );
           System.out.println("Error message for password : " + Password1.getText());
           
		driver.findElement(By.name("password")).sendKeys("Admin@1234");

		System.out.println("Status : Passed");

		Thread.sleep(1000);

	}
	
	public void confirmPassword() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");		
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();		
//		System.out.println("Status Failed: " + "Check if the Organization can be created without Confirm Password(mandatory)");
		 
		WebElement ConfPassword = driver.findElement(By.name("confirmPassword"));
		ConfPassword.click();
		Thread.sleep(5000);
		WebElement ConfPassword1 = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[4]/div/label"))
           );
           System.out.println("Error message for confirm password : " + ConfPassword1.getText());
		
		 driver.findElement(By.name("confirmPassword")).sendKeys("Admin@1234");
		 
		 System.out.println("Status : Passed");
     
     Thread.sleep(1000);
     
	}
	
//-----------------------------------Address Details--------------------------------------------	
	
	public void Address() throws InterruptedException {
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");		
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);	
	driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

//	System.out.println("Status Failed: " + "Check if the Organization can be created without Address(mandatory)");
 
	WebElement Address = driver.findElement(By.name("addr_1"));
    Address.click();
	Thread.sleep(5000);
	WebElement address = wait.until(
           ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Address Line 1 can not be blank!']"))
       );
       System.out.println("Error message for Address : " + address.getText());

       
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

//				System.out.println("Status Failed: " + "Check if the Organization can be created without country(mandatory)");
				
				WebElement Country = driver.findElement(By.name("country"));
			    Country.click();
				Thread.sleep(5000);
				WebElement countryerror = wait.until(
		               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Country can not be blank!']"))
		           );
		           System.out.println("Error message for country : " + countryerror.getText());
		           
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

	//	System.out.println("Status Failed: " + "Check if the Organization can be created without State(mandatory)");
		
		WebElement State = driver.findElement(By.name("state"));
	    State.click();
		Thread.sleep(5000);
		WebElement StateError = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State can not be blank!']"))
           );
           System.out.println("Error message for state : " + StateError.getText());
           
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

//		System.out.println("Status Failed: " + "Check if the Organization can be created without Zone(mandatory)");
		
		WebElement StateInput = driver.findElement(By.name("zone"));
	    StateInput.click();
		Thread.sleep(5000);
		WebElement stateError = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Zone can not be blank!']"))
           );
           System.out.println("Error message for zone : " + stateError.getText());
           
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

//		System.out.println("Status Failed: " + "Check if the Organization can be created without City(mandatory)");

		WebElement CityInput = driver.findElement(By.name("city"));
	    CityInput.click();
		Thread.sleep(5000);
		WebElement cityError = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='City can not be blank!']"))
           );
           System.out.println("Error message for city : " + cityError.getText());
           
		WebElement citySelection = wait.until(ExpectedConditions.elementToBeClickable(By.name("city")));
		Select cityDrop = new Select(citySelection);

	    cityDrop.selectByIndex(2);
	    
	    System.out.println("Status : Passed");

		Thread.sleep(1000);
		
	}
//--------------------------Documentation-------------------------------------------------------
	
	public void UploadDocument() throws InterruptedException {
			 
//		WebElement uploadButton = driver.findElement(By.xpath("(//*[@class='button button-width-auto button-secondary'])[1]"));
//		uploadButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(05));
		
		WebElement fileInput = driver.findElement(By.xpath("(//input[@type='file'])[1]")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", fileInput);
		fileInput.sendKeys("C:\\document1\\file\\VAT_Invoice_282604.pdf");
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(05));
		WebElement fileInput1 = driver.findElement(By.xpath("(//input[@type='file'])[2]")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", fileInput1);
		fileInput1.sendKeys("C:\\document1\\file\\REJECTION_NOTEFPO20258004.pdf");
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(05));
		WebElement fileInput2 = driver.findElement(By.xpath("(//input[@type='file'])[3]")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", fileInput2);
		fileInput2.sendKeys("C:\\document1\\file\\GRN_FPO20260323.pdf");

		
//		uploadButton.click();

        // Optionally click on the Submit/Upload button
 //       driver.findElement(By.id("submitBtn")).click();


	}
//--------------------------Communication Channel-----------------------------------------------
	
	public void EnableWhatsAppButton() {
		driver.findElement(By.xpath("(//input[@class=\"PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3\"])[3]")).click();
		
	}
	
//--------------------------Additional Information----------------------------------------------
	
public void billingEntity() throws InterruptedException {
	By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", getContentContainer());
		driver.findElement(clicksubmit).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		WebElement billing = wait.until(ExpectedConditions.elementToBeClickable(By.name("billing_ent")));
		Select billingEntity = new Select(billing);
		List<WebElement> options = billingEntity.getOptions();
		
		Random rand = new Random();
		int randomIndex = rand.nextInt(options.size() - 1) + 1;
		billingEntity.selectByIndex(randomIndex);
		
	}

public void salesUser() throws InterruptedException {
	By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", getContentContainer());
	driver.findElement(clicksubmit).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	
	WebElement salesUser = wait.until(ExpectedConditions.elementToBeClickable(By.name("sales_user")));
	Select salesUserdropdown = new Select(salesUser);
	List<WebElement> options = salesUserdropdown.getOptions();
	
	Random rand = new Random();
	int randomIndex = rand.nextInt(options.size() - 1) + 1;
	salesUserdropdown.selectByIndex(randomIndex);
	
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
	
	public void clicksubmit() {
		driver.findElement(clicksubmit).click();
	}
	
//----------------------------------Seller Account-----------------------------------------------------	

	public void orgTypeSeller() throws InterruptedException {
		
		By clicksubmit = By.xpath("//button[contains(text(),'Submit')]");
		driver.findElement(clicksubmit).click();

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Org Type(mandatory)");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement orgType = wait.until(ExpectedConditions.elementToBeClickable(By.name("orgType")));
		Select orgTypeDrop = new Select(orgType);

		orgTypeDrop.selectByIndex(4);

		System.out.println("Status : Passed");

		Thread.sleep(1000);

	}
	
	public void subOrgTypeSeller() throws InterruptedException {
        WebElement dropdownElement = driver.findElement(By.name("subOrganizationData"));

        Select dropdown = new Select(dropdownElement);

        List<WebElement> options = dropdown.getOptions();
        
        int minIndex = 1;  
        int maxIndex = options.size() - 1;

        Random rand = new Random();
        int randomIndex = rand.nextInt((maxIndex - minIndex) + 1) + minIndex;

        dropdown.selectByIndex(randomIndex);

}
//---------------------------------Consumer Account Creation------------------------------------
	
	public void orgTypeConsumer() throws InterruptedException {
		
		driver.findElement(clicksubmit).click();

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		System.out.println("Status Failed: " + "Check if the Organization can be created without Org Type(mandatory)");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement orgType = wait.until(ExpectedConditions.elementToBeClickable(By.name("orgType")));
		Select orgTypeDrop = new Select(orgType);

		orgTypeDrop.selectByIndex(3);

		System.out.println("Status : Passed");

		Thread.sleep(1000);

	}
}

