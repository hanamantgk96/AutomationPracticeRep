package pageObject;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LpoPage {
	
	public WebDriver driver;

	public LpoPage(WebDriver driver) {
		this.driver = driver;
}
	By clickgrid = By.xpath("//div[@class='menu-cont' ] //img[@alt='img']");
	By clickprocur = By.xpath("//ul//li//span[text()='Procurement']");
	By clickLpogrid = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/ul[5]/ul/li[3]/span/span");
//	By clickwearhouse = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[1]");
	By clickfilterbutton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div/div[1]/img");
	By selectwearhouse = By.name("del_hub_id");
	By Applyfilter = By.xpath("//button[text()='Apply Filters']");
	By selectproducts = By.xpath("//table//tbody//tr/td[3]");
	By NextButton = By.xpath("//div[text()='Next ']");
	By SubmitButton = By.xpath("//button[text()='SUBMIT']");
	By ConfirmButton = By.xpath("//button[text()='Confirm']");
	By NoButton = By.xpath("//button[text()='No']");
	By CreateLpoVali = By.xpath("//button[text()='Create LPOs']");
	
	public void clickthreedot() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(clickgrid).click();
	}
	
	public void clickprocurement() {
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(clickprocur).click();
	}
	
	public void clickLpo() {
		driver.findElement(clickLpogrid).click();
	}
	
	public void clickwearhousefitler() {
		driver.findElement(clickfilterbutton).click();
	}
	
	public void wearhousedropdown() throws InterruptedException {
//		driver.findElement(wearhouseDropdown).click();		  
        WebElement warehouseDropdown = driver.findElement(selectwearhouse);
        warehouseDropdown.click();
       	         
                Select select = new Select(warehouseDropdown);
                select.selectByValue("50127"); //50465 - Abu Dhabi
 //               select.selectByIndex(1);
	}
	
	public void selectwearouse() {
		driver.findElement(Applyfilter).click();
		
	}
	
	public void searchfield() throws InterruptedException {

	    // Get Order ID column → 12th column in your table
	    List<WebElement> orderIds = driver.findElements(By.xpath("//table//tbody//tr/td[12]"));

	    // Click the filter icon for Order ID column (adjust index if needed)
	    driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium filter-icon  css-vubbuv'])[12]")).click();

	    Thread.sleep(2000);

	    // Pick an Order ID randomly
	    Random random = new Random();
	    int randomIndex = random.nextInt(orderIds.size());
	    String selectedOrderId = orderIds.get(randomIndex).getText();
	    System.out.println("🔍 Selected Order ID: " + selectedOrderId);

	    // Locate the search input box
	    WebElement searchBox = driver.findElement(By.xpath("(//div[@class='grid-text-input'])[1]//input"));

	    Thread.sleep(2000);

	    // Enter the Order ID
	    searchBox.sendKeys(selectedOrderId);
	    searchBox.sendKeys(Keys.ENTER);

	    Thread.sleep(2000);
	}

/*	public void selectproducts() throws InterruptedException {
		
driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium filter-icon  css-vubbuv'])[5]")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//input[contains(@class,'MuiInputBase-input')]")
));

// Type and enter
searchBox.sendKeys("283211");
searchBox.sendKeys(Keys.ENTER);

	    // Wait for overlay to disappear
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.cssSelector(".react-confirm-alert-overlay")));

	    List<WebElement> checkboxes = driver.findElements(selectproducts);
	    System.out.println(checkboxes.size());

	    for (int i = 0; i < 3 && i < checkboxes.size(); i++) {
	        WebElement checkbox = checkboxes.get(i);
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }
	    }
	}*/


	
	/*public void selectproducts() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> checkboxes = driver.findElements(selectproducts);
        System.out.println(checkboxes.size());

        for (int i = 0; i < 3 && i < checkboxes.size(); i++) {
            WebElement checkbox = checkboxes.get(i); 
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            
        }
	}*/
	
	public void clicknextbutton() {
		driver.findElement(NextButton).click();
	}
	
	public void clicksubmittbutton() {
		driver.findElement(SubmitButton).click();
	}
	
	public void ClickConfirmButton() {
		driver.findElement(ConfirmButton).click();
	}
	
	public void clickNoButton(){
		driver.findElement(NoButton).click();
	}
	
	public void CreateLpoValidation() {
		WebElement element = driver.findElement(CreateLpoVali);
		String expectedValue = "Create LPOs";
        String actualValue = element.getText();	        
        Assert.assertEquals(actualValue, expectedValue, "The values don't match!");
        System.out.println("Lpo created sucessfully : " + actualValue);
	}

}