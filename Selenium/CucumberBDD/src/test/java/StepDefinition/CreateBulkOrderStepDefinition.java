package StepDefinition;

import PageObject.Create_bulk_order;
import Utils.Setuptest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateBulkOrderStepDefinition {
	
	public Setuptest testsetup;

	public CreateBulkOrderStepDefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
	}
	
	@Given("Launcg the the browser")
	public void launcg_the_the_browser() {
	    Create_bulk_order Order = testsetup.pageObjectManager.getCreate_bulk_order();
	}
	@When("User can select the business")
	public void user_can_select_the_business() throws InterruptedException {
	    Create_bulk_order Order = testsetup.pageObjectManager.getCreate_bulk_order();
	    Order.CreateBulkOrder();
	}
	@Then("Select the minimum products with all mandatory fields")
	public void select_the_minimum_products_with_all_mandatory_fields() {
		Create_bulk_order Order = testsetup.pageObjectManager.getCreate_bulk_order();
	}
	@Then("Verify the orders created successfully")
	public void verify_the_orders_created_successfully() {
	    
	}

}
