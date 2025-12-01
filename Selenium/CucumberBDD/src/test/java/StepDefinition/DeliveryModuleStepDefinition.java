package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.Delivery_Module;
import PageObject.PlaceOrder;
import Utils.Setuptest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeliveryModuleStepDefinition {
	
public Setuptest testsetup;

	public DeliveryModuleStepDefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
		WebDriver driver;
	}
	@Given("Navigate to delivery module")
	public void navigate_to_delivery_module() throws InterruptedException {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
		order.clickgrid();
		Thread.sleep(1000);
		order.clickdeliveryoption();
		Thread.sleep(1000);
		order.clickschedule();
		Thread.sleep(2000);
	}
	@When("validate the one components atleast on home page")
	public void validate_the_one_components_atleast_on_home_page() throws InterruptedException {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
		order.validatehomepage();
		
	}
	@Then("if user wants to create delivery schedule then they need to click {string} button")
	public void if_user_wants_to_create_delivery_schedule_then_they_need_to_click_button(String string) throws InterruptedException {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
		Thread.sleep(3000);
		order.clickcreatedeliveryschedule();
	}
	@Then("check order id and enterprise name search field working\\/not")
	public void check_order_id_and_enterprise_name_search_field_working_not() throws InterruptedException {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
//		order.searchfieldvalidation();
	}
	@Then("if users wants to change the drivers need to double click on the driver name so that they will get dropdown for driver list")
	public void if_users_wants_to_change_the_drivers_need_to_double_click_on_the_driver_name_so_that_they_will_get_dropdown_for_driver_list() throws InterruptedException {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
		Thread.sleep(2000);
//		order.changedrivers();
//		order.assignRandomDrivers();
	}
	@Then("save the changes and do the drag and drop so orders are rearranging based on drivers")
	public void save_the_changes_and_do_the_drag_and_drop_so_orders_are_rearranging_based_on_drivers() throws InterruptedException {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
		Thread.sleep(2000);
		order.draganddrop();
		Thread.sleep(2000);
		order.selectRandomVehicleAndTime();
	}
	@Then("select the orders with respect to dreiveres and go to the next step")
	public void select_the_orders_with_respect_to_dreiveres_and_go_to_the_next_step() {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
	}
	@Then("2nd step select the departure time and vehicle")
	public void nd_step_select_the_departure_time_and_vehicle() {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
	}
	@Then("check all the selected orders are visible in this step and click submit.")
	public void check_all_the_selected_orders_are_visible_in_this_step_and_click_submit() {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
	}
	@Then("check the delivery schedule created successfully.")
	public void check_the_delivery_schedule_created_successfully() {
		Delivery_Module order = testsetup.pageObjectManager.getDelivery_Module();
	}

}
