package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.LpoPage;
import utilities.BaseClass;

public class LpoCreateSteps {

	public BaseClass setupclass;
	
	public LpoCreateSteps(BaseClass setupclass) {
		this.setupclass = setupclass;
	}
	
	@Given("User Navigate to the create LPO page")
	public void user_navigate_to_the_create_lpo_page() throws InterruptedException {
		LpoPage Lpo = setupclass.pageObjectManager.getLpopage();
		Thread.sleep(2000);
		Lpo.clickthreedot();
		Thread.sleep(2000);
		Lpo.clickprocurement();
		Thread.sleep(2000);
		Lpo.clickLpo();
	}

	@Given("Select products which is approved")
	public void select_products_which_is_approved() throws InterruptedException {
		LpoPage Lpo = setupclass.pageObjectManager.getLpopage();
		Thread.sleep(3000);
		Lpo.clickwearhousefitler();
		Thread.sleep(2000);
		Lpo.wearhousedropdown();
		Thread.sleep(2000);
		Lpo.selectwearouse();
		Thread.sleep(2000);
//		Lpo.selectproducts();
		Lpo.searchfield();
	}

	@Given("Got to second page")
	public void got_to_second_page() throws InterruptedException {
		LpoPage Lpo = setupclass.pageObjectManager.getLpopage();
		Thread.sleep(5000);
		Lpo.clicknextbutton();
	}

	@Given("Got to third page and select the Delivery Hub")
	public void got_to_third_page_and_select_the_delivery_hub() {
		LpoPage Lpo = setupclass.pageObjectManager.getLpopage();
		Lpo.clicknextbutton();
	}

	@Then("Click submit button and click confirm")
	public void click_submit_button_and_click_confirm() {
		LpoPage Lpo = setupclass.pageObjectManager.getLpopage();
		Lpo.clicksubmittbutton();
		Lpo.ClickConfirmButton();
		Lpo.clickNoButton();
	}

	@Then("LPO is successfully created")
	public void lpo_is_successfully_created() throws InterruptedException {
		LpoPage Lpo = setupclass.pageObjectManager.getLpopage();
		Thread.sleep(2000);
		Lpo.CreateLpoValidation();
	}
}
