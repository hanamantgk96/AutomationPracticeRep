package StepDefinition7;

import org.openqa.selenium.WebDriver;

import PageFactory.AccountCreationPage;
import PageFactory.RegistrationPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition7 extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	RegistrationPage obj=new RegistrationPage(driver);
	AccountCreationPage obj1=new AccountCreationPage(driver);
	
	
	@Given("user loads the parabanking website in the browser")
	public void user_loads_the_parabanking_website_in_the_browser() {
		
	System.out.println("The title of WebPage is  "+getTitle());	
	    
	}
	
	
	@Given("user enters the FirstName as {string}")
	public void user_enters_the_first_name_as(String FirstName) {
		
		obj.enterFirstName(FirstName);
		
		
	    
	}

	@Given("user enters the LastName as {string}")
	public void user_enters_the_last_name_as(String LastName) {
		
		
		obj.enterLastName(LastName);
		//scrollDown();
		
	    
	}

	@Given("user enters the Address as {string}")
	public void user_enters_the_address_as(String Address) {
		obj.enterStreet(Address);
	    
	}

	@Given("user enters the City as {string}")
	public void user_enters_the_city_as(String City) {
		
		obj.enterCity(City);
	    
	}

	@Given("user enters the State as {string}")
	public void user_enters_the_state_as(String State) {
		
		obj.enterState(State);
	    
	}

	@Given("user enters the ZipCode as {string}")
	public void user_enters_the_zip_code_as(String string) {
	    
	}

	@Given("user enters the Phone as {string}")
	public void user_enters_the_phone_as(String string) {
	    
	}

	@Given("user enters the SSN as {string}")
	public void user_enters_the_ssn_as(String string) {
	    
	}

	@Given("user enters the UserName as {string}")
	public void user_enters_the_user_name_as(String string) {
	    
	}

	@Given("user enters the Password as {string}")
	public void user_enters_the_password_as(String string) {
	    
	}

	@Given("user enters the confirm Password as {string}")
	public void user_enters_the_confirm_password_as(String string) {
	    
	}

	@When("user clicks on the Register button")
	public void user_clicks_on_the_register_button() {
	   
	}

	@Then("User will be navigated to Parabanking homepage")
	public void user_will_be_navigated_to_parabanking_homepage() {
	    
	}
	
	
	@Then("user closes the browser after execution")
	public void user_closes_the_browser_after_execution() throws InterruptedException {
	    
		closeDriver();
		
	}
	
	@Given("user enters the username in field as {string}")
	public void user_enters_the_username_in_field_as(String uname) {
		
		obj1.enterUserName(uname);
		
		
		
	    
	}

	@Given("user enters the password in field as {string}")
	public void user_enters_the_password_in_field_as(String pwd) {
		
		obj1.enterPassword(pwd);
	    
	}

	@When("user clicks on the submit button of parabanking")
	public void user_clicks_on_the_submit_button_of_parabanking() {
		
		obj1.clickSubmit();
	    
	}

	@When("user clicks on the link of Open New Account")
	public void user_clicks_on_the_link_of_open_new_account() {
		obj1.clickNewAccount();
	    
	}

	@When("user selects the account type as Savings")
	public void user_selects_the_account_type_as_savings() {
		
		obj1.selectAccountType();
	   
	}

	@When("user clicks on Open new Account")
	public void user_clicks_on_open_new_account() {
		
		obj1.accountTypeSubmit();
	    
	}

	@Then("user captures the Account Number")
	public void user_captures_the_account_number() {
		
		obj1.captureAccountNumber();
	   
	}
	
	@Then("user validates the message displayed by the browser")
	public void user_validates_the_message_displayed_by_the_browser() {
		
		obj1.getMessage();
	   
	}

	
	

	

}
