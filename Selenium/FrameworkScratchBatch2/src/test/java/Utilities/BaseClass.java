package Utilities;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static String browserName;
	public static WebDriver driver;
	
	public static WebDriver initializeDriver() 
	{
		try {
			browserName=FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			
			
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			
			
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			
			
		}
		
		return driver;
		
		}
	
	
	public static void scrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
	}
	
	public static String getTitle()
	{
		String title=driver.getTitle();
		return title;
		
	}
	
	public static void closeDriver() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	

}
