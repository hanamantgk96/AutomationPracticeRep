package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	By clickwearhouse = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[1]");
	By wearhouseDropdown = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[2]/div/div[4]/div/div/select");
	By Applyfilter = By.xpath("//button[text()='Apply Filters']");
	By selectproducts = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td/div/span[1]");
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
	
	public void selectproducts() {
		List<WebElement> checkboxes = driver.findElements(selectproducts);
        System.out.println(checkboxes.size());

        for (int i = 0; i < 3 && i < checkboxes.size(); i++) {
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
		String expectedValue = "Create LPOs";
        String actualValue = element.getText();	        
        Assert.assertEquals(actualValue, expectedValue, "The values don't match!");
        System.out.println("Lpo created sucessfully : " + actualValue);
	}
}
