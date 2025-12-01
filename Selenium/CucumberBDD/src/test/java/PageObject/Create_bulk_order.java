package PageObject;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_bulk_order {
	
	public WebDriver driver;

	public Create_bulk_order(WebDriver driver) {
		this.driver = driver;	
	}
	public void CreateBulkOrder() throws InterruptedException {
		
		driver.findElement(By.name("userName")).sendKeys("SNOCADMIN");
		driver.findElement(By.name("password")).sendKeys("Snoc@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"button button-primary\"]")).click(); //login
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='menu-cont' ] //img[@alt='img']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul//li//span[text()='Order']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul//li//span[text()='Place Order']")).click();
	
	for (int i = 1; i <= 20; i++) {
	     System.out.println("Creating Order " + i);		  	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@style=\"position: absolute; top: 10px; right: 12px;\"]")).click();
			
		Thread.sleep(8000);	
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"grid_732322063_0_content_table\"]/tbody/tr"));
		Random random = new Random();
		int randomIndex = random.nextInt(rows.size());
		rows.get(randomIndex).click();
		
		Thread.sleep(1000);
		
		Random random1 = new Random();
		int minSelections = 1;
		int maxSelections = 10;

		int numberOfSelections = random1.nextInt((maxSelections - minSelections) + 1) + minSelections;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> products = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/table/tbody/tr/td/div/input"));

		numberOfSelections = Math.min(numberOfSelections, products.size());

		if (minSelections > products.size()) {
		    System.out.println("Not enough products to make the minimum selections. Exiting.");
		    return;
		}

		Set<Integer> selectedIndices = new HashSet<>();
		while (selectedIndices.size() < numberOfSelections) {
		    selectedIndices.add(random1.nextInt(products.size()));
		}

		for (int index : selectedIndices) {
		    try {
		        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(products.get(index)));
		        if (!product.isSelected()) {
		            product.click();
		        }
		    } catch (StaleElementReferenceException e) {
		        products = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/table/tbody/tr/td/div/input"));
		        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(products.get(index)));
		        if (!product.isSelected()) {
		            product.click();
		        }
		    }
		}
	
       Thread.sleep(2000);
		
		driver.findElement(By.name("lpo_number")).sendKeys("02-march-2025");
		 
		Thread.sleep(2000);
		
		WebElement radioButton = driver.findElement(By.name("billing_address"));
		
       if (!radioButton.isSelected()) {
          
           radioButton.click();
       }
       
       WebElement radio1 = driver.findElement(By.name("shipping_address"));
       
       if (!radio1.isSelected()) {
           
           radio1.click();
       }
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div/div/select")).click();
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div/div/select/option[3]")).click();
       
       driver.findElement(By.name("ship_dt")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker")));

		LocalDate nextDay = LocalDate.now().plusDays(1);
		DateTimeFormatter monthYearFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");
		DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("d"); 

		String targetDay = nextDay.format(dayFormatter);
		String targetMonthYear = nextDay.format(monthYearFormatter);


		while (!driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"))
		        .getText()
		        .contains(targetMonthYear)) {
		    driver.findElement(By.xpath("//button[contains(@class, 'react-datepicker__navigation--next')]")).click();
		}

		List<WebElement> days = driver.findElements(By.cssSelector("div.react-datepicker__month-container div.react-datepicker__month div.react-datepicker__week div.react-datepicker__day"));

		for (WebElement day : days) {
		    String ariaLabel = day.getAttribute("aria-label");
		    if (ariaLabel != null && ariaLabel.contains(targetDay) && ariaLabel.contains(nextDay.format(DateTimeFormatter.ofPattern("MMMM")))) { //check for Day and Month
		        day.click();
		        break; 
		    }
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
    	
		Thread.sleep(1000);    
	   driver.findElement(By.xpath("//button[text()='Review Order']")).click();
	   
	   Thread.sleep(1000);	
	   driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	   
	   Thread.sleep(2000);   
	   driver.findElement(By.xpath("//button[text()='No']")).click();
	   
	   System.out.println("Order " + i + " created successfully!");
	   
		 }
	}
}


