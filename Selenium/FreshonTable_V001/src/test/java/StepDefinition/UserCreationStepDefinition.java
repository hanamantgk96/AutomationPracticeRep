package StepDefinition;

import PageObject.UserCreation;
import Utils.Setuptest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCreationStepDefinition {
	
	Setuptest testsetup;
	public UserCreationStepDefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
	}
	
	@Given("Navigate the organisation page")
	public void navigate_the_organisation_page() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(2000);
		user.clickgrid();
		Thread.sleep(1000);
		user.clickAdministrationoption();
		
	}

	@Given("Clicks on the {} option")
	public void clicks_on_the_option(String string) throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(3000);
		user.clickCreateOrganisation();
	}

	@Then("user provoid an organization name and select organizationType from the dropdown\\(Business,Seller,Consumer)")
	public void user_provoid_an_organization_name_and_select_organization_type_from_the_dropdown_business_seller_consumer() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		user.orgName();
	}

	@Then("Selects {} as the organization type")
	public void selects_as_the_organization_type(String Business) throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(2000);
		user.orgTypebusiness();	
		
	}

	@Then("Fills in all mandatory fields for Organization Profile")
	public void fills_in_all_mandatory_fields_for_organization_details() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		user.firstName();
//		user.trnNo();
//		Thread.sleep(2000);
//		user.grading();
//		Thread.sleep(2000);
		user.mobileNo();
//		Thread.sleep(2000);
		user.Email();
//		Thread.sleep(2000);
//		user.category();
	}

	@Then("Fills in all mandatory fields for Organization Admin Details")
	public void fills_in_all_mandatory_fields_for_organization_admin_details() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(2000);
		user.UserNametype();
		Thread.sleep(2000);
		user.Password();
		Thread.sleep(2000);
		user.confirmPassword();
	}

	@Then("Fills address Details information")
	public void fills_address_details_information()  throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		user.Address();
		Thread.sleep(2000);
		user.Location();
		Thread.sleep(2000);
		user.Country();
		user.State();
		Thread.sleep(2000);
		user.Zone();
		user.City();
	}

	@Then("Enables communication channels radio button and skip if enabled")
	public void enables_all_communication_channels_and_skip_if_enable() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(3000);
		user.EnableWhatsAppButton();
		
	}

	@Then("Uploads all mandatory documents")
	public void uploads_all_mandatory_documents() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(3000);
	//	user.UploadDocument();
	}

	@Then("Fill Additional Information if required")
	public void fill_additional_information_if_required() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
//		Thread.sleep(2000);
//		user.billingEntity();
//		Thread.sleep(1000);
//		user.salesUser();
//		Thread.sleep(3000);
//		user.paymentTerms();
//		Thread.sleep(2000);
//		user.clicksubmit();
	}
	
//---------------------------Seller Account----------------------------------------------------------------

	
	@Then("Selects {string} as the organization type1")
	public void selects_as_the_organization_type1(String string) throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(3000);
		user.orgTypeSeller();
		
}
	@Then("Fills in all mandatory fields for Organization Profile1")
	public void fills_in_all_mandatory_fields_for_organization_profile1() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		user.firstName();
		user.trnNo();
		Thread.sleep(2000);
		user.mobileNo();
		Thread.sleep(2000);
		user.Email();
		Thread.sleep(2000);
		user.subOrgTypeSeller();
	}

	@Then("Fill Additional Information if required1")
	public void fill_additional_information_if_required1() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		Thread.sleep(2000);
		user.paymentTerms();
	}
	
//------------------------------Consumer Account--------------------------------------
	@Then("Selects {string} as the organization type2")
	public void selects_as_the_organization_type2(String string) throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		user.orgTypeConsumer();
	}

	@Then("Fills in all mandatory fields for Organization Profile2")
	public void fills_in_all_mandatory_fields_for_organization_profile2() throws InterruptedException {
		UserCreation user = testsetup.pageObjectManager.getUserCreation();
		user.firstName();
		user.trnNo();
		Thread.sleep(2000);
		user.mobileNo();
		Thread.sleep(2000);
		user.Email();
		Thread.sleep(1000);
		user.trnNo();
	}
}

