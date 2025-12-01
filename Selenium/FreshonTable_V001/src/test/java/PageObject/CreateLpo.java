package PageObject;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateLpo {
	
	public WebDriver driver;

	public CreateLpo(WebDriver driver) {
		this.driver = driver;	
	}
	
	By clickgrid = By.xpath("//div[@class='menu-cont' ] //img[@alt='img']");
	By clickprocur = By.xpath("//ul//li//span[text()='Procurement']");
	By clickLpogrid = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/ul[5]/ul/li[3]/span/span");
	By clickwearhouse = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div/div[1]/img");
	By wearhouseDropdown = By.name("del_hub_id");
	By Applyfilter = By.xpath("//button[text()='Apply Filters']");
	By selectproducts = By.xpath("//div[@class='grid-checkbox-div ']");
	By NextButton = By.xpath("//div[text()='Next ']");
	By SubmitButton = By.xpath("//button[text()='SUBMIT']");
	By ConfirmButton = By.xpath("//button[text()='Confirm']");
	By NoButton = By.xpath("//button[text()='No']");
	By CreateLpoVali = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[11]/div/div");//button[text()='Create LPOs']
	
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
		driver.findElement(clickwearhouse).click();
	}
	
	public void wearhousedropdown() throws InterruptedException {
//		driver.findElement(wearhouseDropdown).click();		  
        WebElement warehouseDropdown = driver.findElement(wearhouseDropdown);
        warehouseDropdown.click();
       	         
                Select select = new Select(warehouseDropdown);
                select.selectByValue("50127"); //50465 - Abu Dhabi
 //               select.selectByIndex(1);
	}
	
	public void selectwearouse() {
		driver.findElement(Applyfilter).click();
		
	}
	
	public void searchfield_validation() throws InterruptedException {
		List<WebElement> products = driver.findElements(By.xpath("//table//tbody//tr/td[3]"));
		
		driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium filter-icon  css-vubbuv'])[1]")).click();
		 Thread.sleep(2000);
        // Pick one product randomly
        Random random = new Random();
        int randomIndex = random.nextInt(products.size());
        String selectedProductName = products.get(randomIndex).getText();
        System.out.println("🔍 Selected product: " + selectedProductName);
        
      // Locate the search box and enter the product name
        WebElement searchBox = driver.findElement(By.xpath("(//div[@class='grid-text-input'])[1]//input")); // adjust locator
 
        Thread.sleep(2000);
        searchBox.sendKeys(selectedProductName);
        searchBox.sendKeys(Keys.ENTER);
         Thread.sleep(2000);
	}

	public void selectproducts() {
		List<WebElement> checkboxes = driver.findElements(selectproducts);
        System.out.println(checkboxes.size());

        for (int i = 0; i < 5 && i < checkboxes.size(); i++) {
            WebElement checkbox = checkboxes.get(i); 
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            
        }
	}
	
	public void selectproductsAfterSearch() {
	    // re-fetch checkboxes AFTER search
	    List<WebElement> checkboxes = driver.findElements(selectproducts);

	    for (int i = 0; i < Math.min(5, checkboxes.size()); i++) {
	        WebElement checkbox = checkboxes.get(i);

	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }
	    }
	}
	
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
		String expectedValue = "Waiting For Acceptance";
        String actualValue = element.getText().trim();	        
        Assert.assertEquals(actualValue, expectedValue,
                "LPO status mismatch! Expected: " + expectedValue + ", but got: " + actualValue);

            System.out.println("✅ LPO created successfully, status: " + actualValue);
	}
}
