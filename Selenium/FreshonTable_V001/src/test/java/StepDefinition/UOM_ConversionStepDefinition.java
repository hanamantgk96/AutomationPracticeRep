package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.UOM_Conversion;
import Utils.Setuptest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UOM_ConversionStepDefinition {

	public Setuptest testsetup;

	public UOM_ConversionStepDefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
		WebDriver driver;
}
	@Given("Navigate the order processing module")
	public void navigate_the_order_processing_module() throws InterruptedException {
		UOM_Conversion uom = testsetup.pageObjectManager.getUOM_Conversion();
		uom.clickgrid();
		Thread.sleep(1000);
		uom.clickdeliveryoption();
		Thread.sleep(1000);
		uom.clickschedule();
		Thread.sleep(2000);
		uom.clickcreateschedule();		
	}

	@Given("Select the UOM Conversion option in the dropdown")
	public void select_the_uom_conversion_option_in_the_dropdown() throws InterruptedException {
		UOM_Conversion uom = testsetup.pageObjectManager.getUOM_Conversion();
		Thread.sleep(2000);
		uom.UOMConversion1();	    
	}

	@When("select the delivery hub and product subcatagory")
	public void select_the_delivery_hub_and_product_subcatagory() {
	    
	}

	@When("select the product which has two uom")
	public void select_the_product_which_has_two_uom() {
	    
	}

	@When("select the seller which is having two UOM within the same seller")
	public void select_the_seller_which_is_having_two_uom_within_the_same_seller() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select the uom to conver which uom they want")
	public void select_the_uom_to_conver_which_uom_they_want() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Once conversion is done the order status will go to the draft status")
	public void once_conversion_is_done_the_order_status_will_go_to_the_draft_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("After that we need to edit\\/update and change it to order created")
	public void after_that_we_need_to_edit_update_and_change_it_to_order_created() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("once update completed successfully conversion is done")
	public void once_update_completed_successfully_conversion_is_done() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
