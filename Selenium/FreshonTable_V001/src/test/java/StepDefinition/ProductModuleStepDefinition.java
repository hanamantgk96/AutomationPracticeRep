package StepDefinition;

import java.util.Date;

import PageObject.PlaceOrder;
import PageObject.Product_Module;
import Utils.Setuptest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductModuleStepDefinition {
	
public Setuptest testsetup;
    
	public ProductModuleStepDefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
		
	}

@Given("The user is on the {string} page")
public void the_user_is_on_the_page(String string) throws InterruptedException {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
	product.ProductCreation();
}

@When("Click submit button without filling mandatory fields and handle the popup message.")
public void click_submit_button_without_filling_mandatory_fields_and_handle_the_popup_message() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
    
}

@Then("fill all mandatory field which are there in products cration page")
public void fill_all_mandatory_field_which_are_there_in_products_cration_page() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("Add atleast one variant of the product and fill all the mandatory fields and save the details")
public void add_atleast_one_variant_of_the_product_and_fill_all_the_mandatory_fields_and_save_the_details() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("Add at least one product images before and before clicking submit button.")
public void add_at_least_one_product_images_before_and_before_clicking_submit_button() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("Validate all the mandatory field that are filled without missing")
public void validate_all_the_mandatory_field_that_are_filled_without_missing() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("Click submit button and validate the product is created successfully.")
public void click_submit_button_and_validate_the_product_is_created_successfully() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

//-------------------------change product status steps-----------------------------------------------------------

@Given("user to click on the view products grid")
public void user_to_click_on_the_view_products_grid() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@When("after creating a product its in under initiated ststus")
public void after_creating_a_product_its_in_under_initiated_ststus() throws InterruptedException {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
	product.ClickStatusdropdown();
}

@Then("select initiated status option in the status filtration")
public void select_initiated_status_option_in_the_status_filtration() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("click change status option in more button")
public void click_change_status_option_in_more_button() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("change the product status as active")
public void change_the_product_status_as_active() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("click submit button")
public void click_submit_button() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("product status changed successfully")
public void product_status_changed_successfully() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

//----------------------------------Edit product-----------------------------------------------------

@Given("click Edit Product in the more button")
public void click_edit_product_in_the_more_button() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}

@Then("click any one of the existing variant")
public void click_any_one_of_the_existing_variant() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
    }

@Then("change the purchage price and selling price")
public void change_the_purchage_price_and_selling_price() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();  
}

@Then("save the changes and click submit button")
public void save_the_changes_and_click_submit_button() {
	Product_Module product = testsetup.pageObjectManager.getProduct_Module();
}
}
