package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateOrder {

	WebDriver driver;
    WebDriverWait wait;
    CreateOrder createOrder;

    @BeforeClass
    @Parameters({"browser", "https://mktadmin.freshontable.com/"})
    public void setUp(String browser, String url) {
        // Setup your WebDriver based on the browser and URL passed from the XML file
        // Assuming WebDriver setup logic here (e.g., ChromeDriver, FirefoxDriver)
        driver = new ChromeDriver();  // Example - This needs to be implemented
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        createOrder = new CreateOrder(driver);
        driver.get(url);
    }

    @Test(priority = 1)
    public void testDraftOrder() throws InterruptedException {
        createOrder.testDraftOrder();
    }

    @Test(priority = 2)
    public void testBusinessFilteration() throws InterruptedException {
        createOrder.testBusinessFilteration();
    }

    @Test(priority = 3)
    public void testProductFilteration() throws InterruptedException {
        createOrder.testProductFilteration();
    }

    @Test(priority = 4)
    public void testFOCOrderCreation() throws InterruptedException {
        createOrder.testFOCOrderCreation();
    }

    @Test(priority = 5)
    public void testValidateTotalAmount() throws InterruptedException {
        double productValue = 100.50;  // Example value to compare
        createOrder.testValidateTotalAmount();
    }

    @Test(priority = 6)
    public void testPastShippDateDate() throws InterruptedException {
        createOrder.testPastShippDateDate();
    }

    @Test(priority = 7)
    public void testShipDateErrorMessageValidation() throws InterruptedException {
        createOrder.testShipDateErrorMessageValidation();
    }

    @Test(priority = 8)
    public void testLpoNumPopupErrorValidation() throws InterruptedException {
        createOrder.testLpoNumPopupErrorValidation();
    }

    @Test(priority = 9)
    public void testSelectPaymentMode() throws InterruptedException {
        createOrder.testSelectPaymentMode();
    }

    @Test(priority = 10)
    public void testSelBillingAddrAndShiAddrPopupErrorValidation() throws InterruptedException {
        createOrder.testSelBillingAddrAndShiAddrPopupErrorValidation();
    }

    @Test(priority = 11)
    public void testSelectByDriver() throws InterruptedException {
        createOrder.testSelectByDriver();
    }

    @Test(priority = 12)
    public void testClickPlaceOrderButton() {
        createOrder.testClickPlaceOrderButton();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

